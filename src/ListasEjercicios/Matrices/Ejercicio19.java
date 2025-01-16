package ListasEjercicios.Matrices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        // En vez de leer las N alturas, leo solo N y genero aleatorios
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Introduzca la cantidad de números a generar: ");
        int n = sc.nextInt();
        int[] alturas = new int[n];

        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = random.nextInt(11);
        }

        System.out.println(Arrays.toString(alturas));

        int suma = 0;
        // Para cada altura que haya en la matriz alturas
        for (int altura : alturas) {
            suma += altura;
        }

        float media = suma / (float)alturas.length;
        System.out.println("Media : " + media);

        int mayores = 0, menores = 0;
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i]>media) {
                mayores++;
            }
            if (alturas[i]<media) {
                menores++;
            }
        }

        System.out.println("Mayores que la media: " + mayores);
        System.out.println("Menores que la media: " + menores);
    }

}
