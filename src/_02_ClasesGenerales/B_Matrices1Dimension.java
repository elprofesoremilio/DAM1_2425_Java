package _02_ClasesGenerales;

import java.util.Scanner;

public class B_Matrices1Dimension {
    public static void main(String[] args) {
        String[] colores = {"azul","rojo","verde"};


        String[] diasSemana;
        diasSemana = new String[7];

        diasSemana[0] = "lunes";
        diasSemana[1] = "martes";
        diasSemana[2] = "miércoles";
        diasSemana[3] = "jueves";
        diasSemana[4] = "viernes";
        diasSemana[5] = "sábado";
        diasSemana[6] = "domingo";

        float[] notas;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas notas vamos a considerar?");
        int cantidad = sc.nextInt();

        notas = new float[cantidad];
        for (int i=0; i<cantidad; i++) {
            System.out.println("Introduzca la nota " + i + ": ");
            notas[i] = sc.nextFloat();
        }

        // OJO OJO OJO --> NO VAYAS A CAMBIAR DATOS DENTRO NUNCA
        for (String dia : diasSemana) {
            System.out.println(dia);
            dia = "pepito";  // Te darás cuenta de que no sirve para nada
        }

        // for-each
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println(diasSemana[i]);
        }

        // Vamos a calcular la media de las notas anteriores
        float suma = 0;
        for (float nota : notas) {
            suma += nota;
        }
        float media = suma / notas.length;
        System.out.println("La media es: " + media);

        float notaMaxima=notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notaMaxima<notas[i]) {
                notaMaxima = notas[i];
            }
        }
        System.out.println("Nota máxima = " + notaMaxima);
    }
}
