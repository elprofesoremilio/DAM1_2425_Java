package EjerciciosClase.Oca;

import java.util.Scanner;

public class Consola {
    Juego juego;
    Scanner entrada;
    public Consola() {
        entrada = new Scanner(System.in);
        int jugadores = solicitarJugadores();
        juego = new Juego(jugadores);
        iniciarPartida();
    }

    private int solicitarJugadores() {
        System.out.println("Introduzca el número de jugadores");
        return entrada.nextInt();
    }

    private void iniciarPartida() {
        do {
            mostrarTablero();
            juego.jugarTurno();
        } while(!juego.terminado());
    }

    private void mostrarTablero() {
        System.out.println(
            String.format("Color: %s - Posicion: %d - Casilla: %s - Retenida: %d",
                juego.colorActivo(), juego.posicionActiva(),
                juego.casillaActiva(), juego.turnosParaJugar()
            )
        );
    }
}
