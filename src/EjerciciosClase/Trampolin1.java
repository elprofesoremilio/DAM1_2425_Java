package EjerciciosClase;

import java.util.Scanner;

public class Trampolin1 {
    public static void main(String[] args) {
        final double BORRADA = -1;
        double[] notas = new double[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextDouble();
        }

        for (int j = 0; j < 2; j++) {
            double maximo = Double.MIN_VALUE;
            double minimo = Double.MAX_VALUE;
            for (int i = 1; i < notas.length; i++) {
                if (maximo<notas[i] && notas[i]!=BORRADA) {
                    maximo = notas[i];
                }
                if (notas[i]<minimo && notas[i]!=BORRADA) {
                    minimo = notas[i];
                }
            }

            boolean heBorrado=false;
            for (int i = 0; i < notas.length && !heBorrado; i++) {
                if (notas[i]==maximo) {
                    notas[i] = BORRADA;
                    heBorrado = true;
                }
            }
            heBorrado=false;
            for (int i = 0; i < notas.length && !heBorrado; i++) {
                if (notas[i]==minimo) {
                    notas[i] = BORRADA;
                    heBorrado = true;
                }
            }
        }

        double total = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] != BORRADA) {
                total+=notas[i];
            }
        }

        total *= 2;

        System.out.println(total);
    }
}

