import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Solicitar el tamaño del arraye por pantalla

        System.out.println(" Dime el tamño del arry ");
        int longitud = scanner.nextInt();

        int[] datos = new int[longitud];

        // Rellenar el array con números aleatorios entre 1 - 10

        System.out.println(" Números aleatorios del array ");

        for (int i = 0; i < longitud; i++) {
            datos[i] = random.nextInt(10) + 1;
        }

        // Muestro el array por consola

        System.out.print(" [");

        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i]);
            if (i < datos.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");

        // Modificar los números impares multiplicandolos por -2

        for (int i = 0; i < longitud; i++) {
            if (datos[i] % 2 != 0) ;
            {
                datos[i] *= -2;
            }
        }

        // Escribir por pantalla los números modificados

        System.out.print(" Números impares modificados  [");

        for (int i = 0; i < datos.length; i++) {

            System.out.print(datos[i]);
            if (i < datos.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");

        // Calcula la media de todos los elementos positivos del
        // vector y escríbela por pantalla.

        int sumaPositivos = 0;
        int totalPositivos = 0;
        for (int num : datos) {
            if (num > 0) {
                sumaPositivos += num;

                totalPositivos++;
            }
        }

        int mediaEntera = 0;
        if (totalPositivos > 0) {
            mediaEntera = sumaPositivos / totalPositivos;

        }


    }
}
