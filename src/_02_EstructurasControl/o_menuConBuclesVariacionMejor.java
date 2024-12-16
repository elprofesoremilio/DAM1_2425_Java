package _02_EstructurasControl;

import java.util.Scanner;

public class o_menuConBuclesVariacionMejor {
    private static final Scanner sc = new Scanner(System.in);

    public static int elegirOpcion() {
        String menu = "\n------------\n" +
                "1. Sumar\n" +
                "2. Restar\n" +
                "3. Multiplicar\n" +
                "4. Dividir\n" +
                "0. Terminar\n" +
                "---------------\n" +
                "Introduzca su elección: ";
        System.out.print(menu);
        return sc.nextInt();
    }

    public static void main(String[] args) {

        int opcion;
        while ((opcion = elegirOpcion()) != 0) {
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
        }

    }
}
