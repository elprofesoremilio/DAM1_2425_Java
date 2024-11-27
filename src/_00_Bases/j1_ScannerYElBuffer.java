package _00_Bases;

import java.util.Scanner;

public class j1_ScannerYElBuffer {
    public static void main(String[] args) {
        // Declaramos el objeto
        Scanner scanner;

        // Instanciamos el objeto
        // LLamo al constructor y le digo que va a leer de la entrada estándar que suele ser el teclado
        scanner = new Scanner(System.in);

        System.out.println("Introduzca 5 números enteros: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();

        // Java detecta tokens
        // Un token es lo que hay entre el comienzo del buffer y el siguiente carácter separador
        //      ENTER, espacio y TAB
    }
}
