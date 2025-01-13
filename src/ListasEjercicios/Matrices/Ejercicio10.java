package ListasEjercicios.Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] matriz = new int[10];

        System.out.println("Introduzca 10 números: ");

        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = sc.nextInt();
        }

        // No es necesario pero voy a guardar los datos
        // en un vector invertido
        int[] invertido = new int[matriz.length];
        for (int i = 0, j = matriz.length-1; i < invertido.length; i++, j--) {
            invertido[i] = matriz[j];
        }

        System.out.println(Arrays.toString(matriz));
        System.out.println(Arrays.toString(invertido));
    }
}
