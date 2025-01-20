package ListasEjercicios.Matrices;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio15 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] matriz = new int[10];

        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = r.nextInt(21) - 10;
        }

        int positivos, negativos, ceros;
        positivos = negativos = ceros = 0;

        for (int numero : matriz) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println(Arrays.toString(matriz));
        System.out.printf("Positivos: %d\nNegativos: %d\nCeros: %d\n", positivos, negativos, ceros);

    }
}
