package EjerciciosClase.Buscaminas;

import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Tablero {
    // CONSTANTES
    public static final int DIFICULTAD_FACIL = 1;
    public static final int DIFICULTAD_MEDIA = 2;
    public static final int DIFICULTAD_DIFICIL = 3;
    public static final int DIFICULTAD_EXPERTO = 4;

    // Atributos
    private Celda[][] celdas;
    private Set<Point> coordenadas;
    private int casillasDestapadas = 0;
    private int numeroMinas;
    private int rows, columns;
    private boolean minaExplotada;


    // Añado un parámetro que nos de la dificultad
    // Lo pongo entero para tomar su valor de unas constantes
    public Tablero(int dificultad) {
        coordenadas = new HashSet<>();

        // En funcion de la dificultad generamos minas y celdas
        switch (dificultad) {
            case DIFICULTAD_MEDIA:
                numeroMinas = 20;
                rows = 10;
                columns = 12;
            break;
            case DIFICULTAD_DIFICIL:
                numeroMinas = 30;
                rows = 12;
                columns = 18;
            break;
            case DIFICULTAD_EXPERTO:
                numeroMinas = 60;
                rows = 14;
                columns = 25;
            break;
            // Si no coincide la dificultad, por defecto ponemos fácil
            case DIFICULTAD_FACIL:
            default:
                numeroMinas = 10;
                rows = 8;
                columns = 8;
        }

        minaExplotada = false;
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
        celdas = new Celda[rows][columns];
        int totalMinas = numeroMinas;

        for (int row = 0; row < celdas.length; row++) {
            for (int col = 0; col < celdas[row].length; col++) {
                celdas[row][col] = new Celda();
            }
        }

        Random random = new Random();
        while (totalMinas>0) {
            // Los números aleatorios deben generarse según ancho x alto
            int row = random.nextInt(rows);
            int col = random.nextInt(columns);

            if (!celdas[row][col].isMina()) {
                totalMinas--;
                celdas[row][col].colocarMina();
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                celdas[row][col].setMinasAlrededor(calcularMinasAlrededor(row,col));
            }
        }
    }

    private byte calcularMinasAlrededor(int row, int col) {
        byte result=0;
        for (Point p : coordenadas) {
            int newRow = row-p.x, newCol = col-p.y;
            // Primero compruebo que las coordenadas son correctas
            if (newRow>=0 && newRow<rows && newCol>=0 && newCol<columns) {
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
        result.append("   ");
        for (int i = 0; i < columns; i++) {
            result.append((i<10?" ":"")).append(i).append(" ");
        }
        result.append("\n");
        for (int row = 0; row< rows; row++) {
            result.append(row).append(row<10?"  ":" ")
                    .append(Arrays.toString(celdas[row])).append("\n");
        }
        return result.toString();
    }

    public boolean destapar(int row, int col) {
        Celda celda = celdas[row][col];
        if (celda.isDestapada()) {
            return false;
        }
        casillasDestapadas++;
        if (celda.destapar()) {
            minaExplotada = true;
            return true;
        } else if (celda.getMinasAlrededor()==0){
            for (Point p : coordenadas) {
                int newRow = row - p.x, newCol = col - p.y;
                // Primero compruebo que las coordenadas son correctas
                // TODO: isCoordenadasOK(row, col) que lance FueraDeTableroException y aquí capturar excepción
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < columns) {
                    // Si son correctas y no la he destapado antes, destapo
                    if (!celdas[newRow][newCol].isDestapada()) {
                        destapar(newRow, newCol);
                    }
                }
            }
        }
        return casillasDestapadas==(columns * rows -numeroMinas);
    }

    public void destaparMinas() {
        for (Celda[] fila : celdas) {
            for (Celda celda : fila) {
                if (celda.isMina()) {
                    celda.destapar();
                }
            }
        }
    }

    public boolean calcularResultado() {
        return (!minaExplotada) && casillasDestapadas==((columns * rows)-numeroMinas);
    }

}
