package EjerciciosClase.DobleTriple;

import java.util.Scanner;

public class DevolverDobleTriple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();

        MiMath calculos = new MiMath(numero);
        System.out.println("A continuación mostramos el doble y el triple de " + numero);
        System.out.println(calculos.doble());
        System.out.println(calculos.triple());
    }
}
