package EjerciciosClase.Buscaminas;

import java.util.Scanner;

public class BuscaminasConsola {
    private Tablero tablero;
    Scanner sc;

    public BuscaminasConsola() {
        tablero = new Tablero();
        tablero.crearTablero();
        sc = new Scanner(System.in);
    }

    public void mostrarTablero() {
        System.out.println(tablero);
    }

    public boolean destapar() {
        System.out.println("Introduzca las coordenadas para destapar celda: ");
        int row = sc.nextInt(), col = sc.nextInt();
        return tablero.destapar(row,col);
    }

    public static void main(String[] args) {
        BuscaminasConsola buscaminas = new BuscaminasConsola();
        buscaminas.mostrarTablero();
        boolean juegoTerminado = buscaminas.destapar();
        while (!juegoTerminado) {
            buscaminas.mostrarTablero();
            juegoTerminado = buscaminas.destapar();
        }
        buscaminas.mostrarTablero();
    }
}
