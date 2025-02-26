package EjerciciosClase.Buscaminas;

import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Tablero {
    Celda[][] celdas;
    Set<Point> coordenadas;

    public Tablero() {
        coordenadas = new HashSet<>();
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
        // TODO - hacer que sea configurable el tamaño
        celdas = new Celda[8][8];
        int totalMinas = 10;

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
        for (Celda[] fila : celdas) {
            result.append(Arrays.toString(fila)).append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        tablero.crearTablero();
        System.out.println(tablero);
    }

}
