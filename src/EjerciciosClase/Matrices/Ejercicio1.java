package EjerciciosClase.Matrices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    // Rellenar un vector con números aleatorios
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño del vector: ");

        int[] numeros = new int[sc.nextInt()];

        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(numeros));
    }
}
