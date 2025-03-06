package EjerciciosClase.Buscaminas.Vista;

import EjerciciosClase.Buscaminas.Controlador.Buscaminas;
import EjerciciosClase.Buscaminas.Modelo.Tablero;

import java.util.Arrays;
import java.util.Scanner;

// TODO: hacer que buscaminasConsola no sea la vista sino otro controlador
public class VistaConsola {
    Scanner sc;
    Buscaminas buscaminas;

    public VistaConsola() {
        sc = new Scanner(System.in);
    }

    private void mostrarTablero() {
        StringBuilder result = new StringBuilder();
        result.append("   ");
        for (int i = 0; i < buscaminas.getColumns(); i++) {
            result.append((i<10?" ":"")).append(i).append(" ");
        }
        result.append("\n");
        for (int row = 0; row< buscaminas.getRows(); row++) {
            result.append(row).append(row<10?"  ":" ")
                    .append(convertirFilaAString(row)).append("\n");
        }
        System.out.println(result);
    }

    private String convertirFilaAString(int row) {
        StringBuilder result = new StringBuilder();

        for (int column = 0; column < buscaminas.getColumns(); column++) {
            if (!buscaminas.isDestapada(row, column)) {
                result.append(" ").append('\u2395').append(" ");
            } else {
                if (buscaminas.isMina(row, column)) {
                    result.append(" * ");
                } else {
                    result.append(" ").append(buscaminas.getMinasAlrededor(row, column)).append(" ");
                }
            }
        }

        return result.toString();
    }

    private boolean destapar() {
        System.out.println("Introduzca las coordenadas para destapar celda: ");
        int row = sc.nextInt(), col = sc.nextInt();
        return buscaminas.destapar(row,col);
    }

    private boolean calcularResultado() {
        return buscaminas.calcularResultado();
    }

    public void iniciarPartida() {
        elegirDificultad();
        mostrarTablero();
        boolean juegoTerminado = destapar();
        while (!juegoTerminado) {
            mostrarTablero();
            juegoTerminado = destapar();
        }
        if (calcularResultado()) {
            mostrarTablero();
            System.out.println("¡HAS GANADO!");
        } else {
            System.out.println("Has perdido :(");
            buscaminas.destaparMinas();
            mostrarTablero();
        }
    }

    private void elegirDificultad() {
        System.out.println("Elija la dificultad: \n" +
                "1. Fácil\n" +
                "2. Media\n" +
                "3. Difícil\n" +
                "4. Para expertos\n" +
                "0. Terminar\n");
        int dificultad = sc.nextInt();
        if (dificultad==0) {
            System.out.println("Salir del juego");
            System.exit(0);
        }
        buscaminas = new Buscaminas(dificultad);
    }

}
