package EjerciciosClase.Buscaminas;

import java.util.Scanner;

// TODO: hacer que buscaminasConsola no sea la vista sino otro controlador
public class BuscaminasConsola {
    private Tablero tablero;
    Scanner sc;

    public BuscaminasConsola() {
        tablero = new Tablero();
        tablero.crearTablero();
        sc = new Scanner(System.in);
    }

    private void mostrarTablero() {
        System.out.println(tablero);
    }

    private boolean destapar() {
        System.out.println("Introduzca las coordenadas para destapar celda: ");
        int row = sc.nextInt(), col = sc.nextInt();
        return tablero.destapar(row,col);
    }

    private boolean calcularResultado() {
        return tablero.calcularResultado();
    }

    public void iniciarPartida() {
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
            tablero.destaparMinas();
            mostrarTablero();
        }
    }

}
