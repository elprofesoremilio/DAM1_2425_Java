package _04_Graphics.D_Animaciones.Game;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego("Prueba");
        Jugador player1;
        Jugador player2;

        player1 = new Jugador(5, 100, 50, Color.blue, 1);
        player2 = new Jugador(350, 150, 50, Color.red, -1);

        juego.add(player1);
        juego.add(player2);

        Pelota pelota = new Pelota(150, 50, 25, Color.black);

        juego.add(pelota);

        juego.iniciar();
    }
}
