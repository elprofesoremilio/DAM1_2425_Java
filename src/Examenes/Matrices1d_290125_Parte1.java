package Examenes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrices1d_290125_Parte1 {
    public static void main(String[] args) {
        int[] datos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de datos: ");
        datos = new int[sc.nextInt()];
        Random random = new Random();
        for (int i = 0; i < datos.length; i++) {
            datos[i] = random.nextInt(10)+1;
        }
        System.out.println(Arrays.toString(datos));
        System.out.println("Introduzca el número a buscar y por cuál sustituirlo: ");
        int a = sc.nextInt(), b = sc.nextInt();
        int contador=0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == a) {
                datos[i] = b;
                contador++;
            }
        }

        int distintos=0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            for (int numero : datos) {
                if (i == numero) {
                    distintos++;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(datos));
        System.out.printf("Datos cambiados: %d\n" +
                "Datos distintos: %d", contador, distintos);

    }
}
