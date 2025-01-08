package _02_ClasesGenerales;

import java.util.Arrays;
import java.util.Random;

public class B_MatricesEjemplo1 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(11);
        }

        int maximo = numeros[0];
        int i, indiceMaximo=0;

        for (i = 1; i < numeros.length; i++) {
            if (maximo<numeros[i]) {
                maximo = numeros[i];
                indiceMaximo = i;
            }
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println(indiceMaximo);

    }
}
