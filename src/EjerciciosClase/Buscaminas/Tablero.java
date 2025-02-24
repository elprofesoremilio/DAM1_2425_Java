package EjerciciosClase.Buscaminas;

import java.util.Arrays;
import java.util.Random;

public class Tablero {
    Celda[][] celdas;

    public Tablero() {
    }

    public void crearTablero() {
        // TODO - hacer que sea configurable el tamaño
        celdas = new Celda[8][8];
        int totalMinas = 10;

        for (int row = 0; row < celdas.length; row++) {
            for (int col = 0; col < celdas.length; col++) {
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
