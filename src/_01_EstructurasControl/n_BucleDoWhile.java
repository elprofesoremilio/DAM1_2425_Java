package _01_EstructurasControl;

import java.util.Scanner;

public class n_BucleDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Seguir" +
                    "\n0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Seguir");
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion!=0);
    }
}
