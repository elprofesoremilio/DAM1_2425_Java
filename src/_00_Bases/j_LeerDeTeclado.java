package _00_Bases;

import java.util.Scanner;

public class j_LeerDeTeclado {
    public static void main(String[] args) {
        Scanner scanner;

        // LLamo al constructor y le digo que va a leer de la entrada estándar que suele ser el teclado
        scanner = new Scanner(System.in);

        System.out.println("Introduce un entero: ");
        int entero=scanner.nextInt();
        System.out.println("Introduce un flotante: ");
        float flotante=scanner.nextFloat();

        System.out.println(entero + "," + flotante);

        String cadena = scanner.nextLine();
        System.out.println(cadena);
        // EXPLICAMOS EL TEMITA DEL BUFFER EL LUNES
    }
}
