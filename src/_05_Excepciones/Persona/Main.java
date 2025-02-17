package _05_Excepciones.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Pepito", 17);
        Scanner sc = new Scanner(System.in);
        boolean edadIncorrecta = true;
        int edad;
        while (edadIncorrecta) {
            System.out.println("Introduzca la edad: ");
            edad = sc.nextInt();
            try {
                persona.setEdad(edad);
                edadIncorrecta = false;
            } catch (EdadInvalidaException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println(persona);

    }
}
