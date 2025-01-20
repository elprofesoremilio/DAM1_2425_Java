package EjerciciosClase;

import java.util.Arrays;
import java.util.Scanner;

public class Trampolin {
    public static void main(String[] args) {
        final double BORRADA = -1;
        double[] notas = new double[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextDouble();
        }

        // Buscamos primer máximo
        double maximo = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (maximo<notas[i]) {
                maximo = notas[i];
            }
        }

        // Borramos primer máximo
        boolean heBorrado=false;
        for (int i = 0; i < notas.length && !heBorrado; i++) {
            if (notas[i]==maximo) {
                notas[i] = BORRADA;
                heBorrado = true;
            }
        }

        // Buscamos segundo máximo
        maximo = Double.MIN_VALUE;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]>maximo && notas[i]!=BORRADA) {
                maximo = notas[i];
            }
        }

        // Borramos segundo máximo
        heBorrado=false;
        for (int i = 0; i < notas.length && !heBorrado; i++) {
            if (notas[i]==maximo) {
                notas[i] = BORRADA;
                heBorrado = true;
            }
        }

        // Hacemos lo mismo con los mínimos
        double minimo = Double.MAX_VALUE;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]<minimo && notas[i]!=BORRADA) {
                minimo = notas[i];
            }
        }

        heBorrado=false;
        for (int i = 0; i < notas.length && !heBorrado; i++) {
            if (notas[i]==minimo) {
                notas[i] = BORRADA;
                heBorrado = true;
            }
        }

        minimo = Double.MAX_VALUE;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]<minimo && notas[i]!=BORRADA) {
                minimo = notas[i];
            }
        }

        heBorrado=false;
        for (int i = 0; i < notas.length && !heBorrado; i++) {
            if (notas[i]==minimo) {
                notas[i] = BORRADA;
                heBorrado = true;
            }
        }

        // Calculamos resultado sin tener en cuenta borrados
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
