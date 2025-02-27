package Examenes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrices1d_230125 {
    public static void Opcion1() {
        Scanner sc = new Scanner(System.in);
        int[] datos;
        System.out.println("Introduzca la cantidad de datos a contemplar: ");
        int longitud = sc.nextInt();
        datos = new int[longitud];
        Random random = new Random();
        for (int i = 0; i < datos.length; i++) {
            datos[i] = random.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(datos));
        for (int i = 0; i < datos.length; i++) {
            if (datos[i]%2!=0) {
                datos[i] *= -2;
            }
        }
        System.out.println(Arrays.toString(datos));

        System.out.print("[ ");
        for (int i = 0; i < datos.length; i++) {
            if (datos[i]<0) {
                System.out.print(datos[i] + " ");
            }
        }
        System.out.println("]");

        int suma = 0;
        int contador = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i]>0) {
                suma+=datos[i];
                contador++;
            }
        }
        int media = suma/contador;
        boolean existe=false;

        for (int i = 0; i < datos.length; i++) {
            if (datos[i]<0 && (Math.abs(datos[i])==media)) {
                existe = true;
                break;
            }
        }
        System.out.printf("Media: %d\nExiste negativo: %s",media,Boolean.toString(existe));

    }

    public static void Opcion2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la longitud del array: ");
        int[] datos = new int[sc.nextInt()];
        Random random = new Random();
        for (int i = 0; i < datos.length; i++) {
            datos[i] = random.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(datos));
        for (int i = 0; i < datos.length; i++) {
            if (datos[i]%2!=0) {
                datos[i]*=-2;
            }
        }
        System.out.println(Arrays.toString(datos));
        int[] datosModificados = new int[datos.length];
        int indice = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i]<0) {
                datosModificados[indice] = datos[i];
                indice++;
            }
        }
        int posicionExacta = indice;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i]>0) {
                datosModificados[indice] = datos[i];
                indice++;
            }
        }
        System.out.println(indice);
    }

    public static void main(String[] args) {
        Opcion2();
    }
}
