package EjerciciosClase.Calculadora;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los operadores 1 y 2: ");
        float op1 = sc.nextFloat();
        float op2 = sc.nextFloat();

        Calculadora calculadora = new Calculadora(op1, op2);
        float suma = calculadora.sumar();
        System.out.println("SUMA: " + suma);
        System.out.println("Resta: " + calculadora.restar());
        System.out.println("Multiplicar: " + calculadora.multiplicar());
        System.out.println("Dividir: " + calculadora.dividir());
    }
}
