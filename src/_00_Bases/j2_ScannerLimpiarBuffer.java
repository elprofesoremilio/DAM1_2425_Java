package _00_Bases;

import java.util.Scanner;

public class j2_ScannerLimpiarBuffer {
    public static void main(String[] args) {
        // Declaramos el objeto
        Scanner scanner;

        // Instanciamos el objeto
        // LLamo al constructor y le digo que va a leer de la entrada estándar que suele ser el teclado
        scanner = new Scanner(System.in);

        System.out.println("Introduzca 1 número entero: ");
        int entero = scanner.nextInt();

        // Limpiando el buffer
        scanner.nextLine();

        System.out.println("Introduzca su nombre: ");
        String nombre = scanner.nextLine();


        // ¿Cuándo hay que limpiar el búffer?
        // Siempre que vaya a leer texto con nextLine, después de haber leído por tokens
    }
}
