package Examenes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrices1d_290125_Parte2 {
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

        boolean[] primerCambio= new boolean[datos.length];

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == a) {
                datos[i] = b;
                contador++;
                primerCambio[i] = true;
            } else {
                primerCambio[i] = false;
            }
        }

        System.out.print("Posiciones cambiadas:");
        for (int i = 0; i < primerCambio.length; i++) {
            if (primerCambio[i]) {
                System.out.print(" " +i);
            }
        }

        int distintos=0;
        for (int i = 1; i < 10; i++) {
            for (int numero : datos) {
                if (i == numero) {
                    distintos++;
                    break;
                }
            }
        }

        System.out.println("\n"+Arrays.toString(datos));
        System.out.printf("Datos primerCambio: %d\n" +
                "Datos distintos: %d\n", contador, distintos);

        System.out.println("Introduzca el número a buscar y por cuál sustituirlo: ");
        a = sc.nextInt();
        b = sc.nextInt();

        boolean[] segundoCambio= new boolean[datos.length];
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == a) {
                datos[i] = b;
                segundoCambio[i] = true;
            } else {
                segundoCambio[i] = false;
            }
        }

        int longitud = 0;
        for (int i = 0; i < primerCambio.length; i++) {
            if (primerCambio[i] || segundoCambio[i]) {
                longitud++;
            }
        }

        int[] nuevoVector = new int[datos.length-longitud];
        for (int i = 0, index=0; i < datos.length; i++) {
            if (!primerCambio[i] && !segundoCambio[i]) {
                nuevoVector[index] = datos[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(nuevoVector));
    }
}
