package ListasEjercicios.Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio22b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número: ");
        int numero = sc.nextInt();
        int copiaNumero = numero;
        int cifras = 0;

        // Calcular el número de cifras
        while (numero>0) {
            cifras++;
            numero /= 10;
        }

        numero = copiaNumero;
        int[] matriz = new int[cifras];

        for (int i = cifras-1; i >= 0; i--) {
            matriz[i] = numero%10;
            numero /= 10;
        }

        System.out.println(Arrays.toString(matriz));
    }
}
