package _04_Graphics.Z_Ejemplos.Arkanoid;

import _04_Graphics.Utils.CutrEngine.Juego;

import java.awt.*;

public class Arkanoid {

    public static void main(String[] args) {
        Juego juego = Config.JUEGO = new Juego("Arkanoid",Config.ANCHO_PANTALLA,Config.ALTO_PANTALLA);

        Jugador jugador = new Jugador(
                Config.posicionarMedio(Config.ANCHO_PANTALLA,50),
                Config.ALTO_PANTALLA/4*3,
                50, 10, 3, Color.red
        );

        juego.add(jugador);


        juego.add(new Pelota(
                jugador,
                Config.posicionarMedio(Config.ANCHO_PANTALLA/2, Config.RADIO_PELOTA),
                Config.ALTO_PANTALLA/4 - Config.RADIO_PELOTA/2,
                Config.RADIO_PELOTA,
                Config.COLOR_PELOTA
                )
        );

        int inicioX = 25;
        int inicioY = 30;
        int ancho = 50;
        int alto = 10;
        int hueco = 10;

        for (int filas = 0, posX = inicioX, posY = inicioY; filas < 4; filas++) {
            for (int columnas = 0; columnas < 9; columnas++) {
                juego.add(new Ladrillo(posX, posY, ancho, alto, Color.black));
                posX += ancho + hueco;
            }
            posX = inicioX;
            posY += alto + hueco;
        }



        juego.iniciar();
    }
}
