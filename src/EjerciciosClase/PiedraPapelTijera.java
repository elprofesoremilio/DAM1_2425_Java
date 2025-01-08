package EjerciciosClase;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        int resultado = 0;
        Scanner scanner = new Scanner(System.in);

        int numero;
        Random random = new Random();
        do {
            System.out.println("Introduzca un número entre 1 y 3, 0 para salir.");
            numero = scanner.nextInt();
            int aleatorio = random.nextInt(3) + 1;

            switch (numero) {
                case 1:
                    if (aleatorio == 2) {
                        resultado++;
                    } else if (aleatorio == 3) {
                        resultado--;
                    }
                    break;
                case 2:
                    if (aleatorio == 3) {
                        resultado++;
                    } else if (aleatorio == 1) {
                        resultado--;
                    }
                    break;
                case 3:
                    if (aleatorio == 1) {
                        resultado++;
                    } else if (aleatorio == 2) {
                        resultado--;
                    }
                    break;
                case 0:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Número incorrecto, debe estar entre 1 y 3");
            }


        } while (numero!=0 && Math.abs(resultado)!=5);
        System.out.println("Resultado final: " + resultado);
    }
}
