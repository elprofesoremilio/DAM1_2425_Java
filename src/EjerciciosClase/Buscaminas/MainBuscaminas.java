package EjerciciosClase.Buscaminas;

import EjerciciosClase.Buscaminas.Vista.VistaConsola;
import EjerciciosClase.Buscaminas.Vista.VistaSwing;

import java.util.Scanner;

public class MainBuscaminas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique el modo de juego: \n1. Consola\n2. Ventana");
        if (sc.nextInt()==2) {
            new VistaSwing();
        } else {
            VistaConsola buscaminasConsola = new VistaConsola();
            buscaminasConsola.iniciarPartida();
        }
    }
}
