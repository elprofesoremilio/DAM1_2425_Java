package _00_Bases;

import java.util.Scanner;

public class j0_LeerDeTeclado {
    public static void main(String[] args) {
        // Declaramos el objeto
        Scanner scanner;

        // Instanciamos el objeto
        // LLamo al constructor y le digo que va a leer de la entrada estándar que suele ser el teclado
        scanner = new Scanner(System.in);

        System.out.println("Introduce una única palabra: ");
        String token = scanner.next();

        System.out.println("Esto es un token: " + token);

        System.out.println("Introduce un entero: ");
        int entero = scanner.nextInt();
        System.out.println("Introduce un flotante: ");
        float flotante = scanner.nextFloat();

        System.out.println("Número entero introducido: " + entero + "\n"
                + "Número flotante introducido: " + flotante);

        System.out.println("Introduzca un texto: ");
        String cadena = scanner.nextLine();
        System.out.println(cadena);
        // ¿Qué ha sucedido, por qué no me deja leer la línea?

        // EXPLICAMOS EL TEMITA DEL BUFFER EL LUNES
    }
}
