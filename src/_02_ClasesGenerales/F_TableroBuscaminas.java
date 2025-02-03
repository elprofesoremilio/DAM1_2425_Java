package _02_ClasesGenerales;

import java.util.Arrays;
import java.util.Random;

public class F_TableroBuscaminas {
    public static final int LENGTH = 10;
    public static final int AMOUNT = 8;

    public static void main(String[] args) {
        char[][] tablero = new char[LENGTH][LENGTH];
        int contadorMinas = 0;
        Random random = new Random();

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = ' ';
            }
        }

        while (contadorMinas<AMOUNT) {
            int x=random.nextInt(LENGTH), y=random.nextInt(LENGTH);
            if (tablero[x][y] == ' ') {
                tablero[x][y] = '*';
                contadorMinas++;
            }
        }

        for (char[] fila : tablero) {
            System.out.println(Arrays.toString(fila));
        }

    }
}
