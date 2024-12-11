package _02_EstructurasControl;

import java.util.Scanner;

public class menuConBucles {
    public static void main(String[] args) {
        String menu = "\n------------\n" +
                "1. Sumar\n" +
                "2. Restar\n" +
                "3. Multiplicar\n" +
                "4. Dividir\n" +
                "0. Terminar\n" +
                "---------------\n" +
                "Introduzca su elección: ";
        System.out.print(menu);

        Scanner sc = new Scanner(System.in);

        int opcion = sc.nextInt();
        while (opcion!=0) {
            switch (opcion) {
                case 1:
                    System.out.println("SUMAR");
                    break;
                case 2:
                    System.out.println("RESTAR");
                    break;
                case 3:
                    System.out.println("MULTIPLICAR");
                    break;
                case 4:
                    System.out.println("DIVIDIR");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
            System.out.println(menu);
            opcion = sc.nextInt();
        }

    }
}
