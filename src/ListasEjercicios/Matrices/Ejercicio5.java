package ListasEjercicios.Matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector; // Declaro una matriz unidimensional de enteros
        vector = new int[5]; // Asigno un tamaño de 5 a la matriz unidimensional de enteros

        System.out.println("Introduzca 5 números enteros separados por espacios: ");
        for (
                int i=0;
                i<vector.length;
                i++
        ) {
            vector[i] = sc.nextInt();
        }

        int suma = 0;
        for (
                int i = 0;
                i < vector.length;
                i++
        ) {
            suma+=vector[i];
        }
        System.out.println(suma);
    }
}
