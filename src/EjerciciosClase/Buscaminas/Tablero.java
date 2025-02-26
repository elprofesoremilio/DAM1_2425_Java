package EjerciciosClase.Buscaminas;

import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Tablero {
    Celda[][] celdas;
    Set<Point> coordenadas;
    int casillasDestapadas = 0;
    int numeroMinas;
    int alto, ancho;

    public Tablero() {
        coordenadas = new HashSet<>();
        // TODO - hacer que sea configurable el tamaño
        numeroMinas = 10;
        alto = 8;
        ancho = 8;
        coordenadas.add(new Point(-1,-1));
        coordenadas.add(new Point(-1,0));
        coordenadas.add(new Point(-1,1));
        coordenadas.add(new Point(0,-1));
        coordenadas.add(new Point(0,1));
        coordenadas.add(new Point(1,-1));
        coordenadas.add(new Point(1,0));
        coordenadas.add(new Point(1,1));
    }

    public void crearTablero() {
        celdas = new Celda[alto][ancho];
        int totalMinas = numeroMinas;

        for (int row = 0; row < celdas.length; row++) {
            for (int col = 0; col < celdas[row].length; col++) {
                celdas[row][col] = new Celda();
            }
        }

        Random random = new Random();
        while (totalMinas>0) {
            int row = random.nextInt(8);
            int col = random.nextInt(8);

            if (!celdas[row][col].isMina()) {
                totalMinas--;
                celdas[row][col].colocarMina();
            }
        }

        for (int row = 0; row < celdas.length; row++) {
            for (int col = 0; col < celdas[row].length; col++) {
                celdas[row][col].setMinasAlrededor(calcularMinasAlrededor(row,col));
            }
        }
    }

    private byte calcularMinasAlrededor(int row, int col) {
        byte result=0;
        for (Point p : coordenadas) {
            int newRow = row-p.x, newCol = col-p.y;
            // Primero compruebo que las coordenadas son correctas
            if (newRow>=0 && newRow<celdas.length && newCol>=0 && newCol<celdas[row].length) {
                // Si son correctas miro si hay mina
                if (celdas[newRow][newCol].isMina()) {
                    result++;
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("  ");
        for (int i = 0; i < ancho; i++) {
            result.append(" ").append(i).append(" ");
        }
        result.append("\n");
        for (int row=0; row<alto; row++) {
            result.append(row).append(" ")
                    .append(Arrays.toString(celdas[row])).append("\n");
        }
        return result.toString();
    }

    public boolean destapar(int row, int col) {
        Celda celda = celdas[row][col];
        casillasDestapadas++;
        if (celda.destapar()) {
            return true;
        } else if (celda.getMinasAlrededor()==0){
            for (Point p : coordenadas) {
                int newRow = row - p.x, newCol = col - p.y;
                // Primero compruebo que las coordenadas son correctas
                if (newRow >= 0 && newRow < celdas.length && newCol >= 0 && newCol < celdas[row].length) {
                    // Si son correctas y no la he destapado antes, destapo
                    if (!celdas[newRow][newCol].isDestapada()) {
                        destapar(newRow, newCol);
                    }
                }
            }
        }
        return casillasDestapadas==(ancho*alto-numeroMinas);
    }

}
