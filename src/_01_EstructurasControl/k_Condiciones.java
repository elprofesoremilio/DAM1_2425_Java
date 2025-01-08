package _01_EstructurasControl;

import java.util.Random;

public class k_Condiciones {
    public static void main(String[] args) {
        Random random = new Random();
        int edad = random.nextInt(25);

        if (edad<18) {
            System.out.println("Menor de edad");
        } else {
            System.out.println("Mayor de edad");
        }

        if (edad==21) {
            System.out.println("Mayoría de edad en EEUU");
        } else if (edad==0) {
            System.out.println("Recién nacido");
        } else if (edad==12) {
            System.out.println("Bienvenido a la adolescencia");
        }

        int dia = random.nextInt(6) + 1;

        switch (dia) {
            case 6:
                System.out.println("Qué bonito el sábado");
                // Como no he puesto break continúa ejecutando
            case 7:
                System.out.println("No hay instituto");
                break;
            default:
                System.out.println("A clase");
        }


    }
}
