package EjerciciosClase.Buscaminas.Modelo;

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
    private Set<Point> coordenadasAlrededor;
    private int casillasDestapadas = 0;
    private int numeroMinas;
    private int rows;
    private int columns;
    private boolean minaExplotada;


    // Añado un parámetro que nos de la dificultad
    // Lo pongo entero para tomar su valor de unas constantes
    public Tablero(int dificultad) {
        coordenadasAlrededor = new HashSet<>();

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
        coordenadasAlrededor.add(new Point(-1,-1));
        coordenadasAlrededor.add(new Point(-1,0));
        coordenadasAlrededor.add(new Point(-1,1));
        coordenadasAlrededor.add(new Point(0,-1));
        coordenadasAlrededor.add(new Point(0,1));
        coordenadasAlrededor.add(new Point(1,-1));
        coordenadasAlrededor.add(new Point(1,0));
        coordenadasAlrededor.add(new Point(1,1));
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
        for (Point p : coordenadasAlrededor) {
            int newRow = row+p.x, newCol = col+p.y;
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

    /**
     * @param row
     * @param col
     * @return true si se destapa una mina
     */
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
            for (Point p : coordenadasAlrededor) {
                int newRow = row + p.x, newCol = col + p.y;
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

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public String getInfoMina(int fila, int columna) {
        return celdas[fila][columna].toString();
    }

    public boolean isDestapada(int row, int column) {
        return celdas[row][column].isDestapada();
    }

    public boolean isMina(int row, int column) {
        return celdas[row][column].isMina();
    }

    public int getMinasAlrededor(int row, int column) {
        return celdas[row][column].getMinasAlrededor();
    }
}
