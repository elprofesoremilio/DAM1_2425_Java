package ListasEjercicios.Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número y su cantidad de cifras o dígitos: ");
        int numero = sc.nextInt();
        int cifras = sc.nextInt();

        int[] matriz = new int[cifras];

        for (int i = cifras-1; i >= 0; i--) {
            matriz[i] = numero%10;
            numero /= 10;
        }

        System.out.println(Arrays.toString(matriz));
    }
}
