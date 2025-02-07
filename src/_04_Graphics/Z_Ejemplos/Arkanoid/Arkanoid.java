package _04_Graphics.Z_Ejemplos.Arkanoid;

import _04_Graphics.Utils.CutrEngine.Juego;

import java.awt.*;
import java.util.LinkedList;

public class Arkanoid {
    public static Jugador jugador;
    public static LinkedList<Ladrillo> ladrillos = new LinkedList<>();
    public static Pelota pelota;


    public static void main(String[] args) {
        Juego juego = Config.JUEGO = new Juego("Arkanoid",Config.ANCHO_PANTALLA,Config.ALTO_PANTALLA);

        jugador = new Jugador(
                Config.posicionarMedio(Config.ANCHO_PANTALLA,50),
                Config.ALTO_PANTALLA/4*3,
                50, 10, 3, Color.red
        );

        juego.add(jugador);


        pelota = new Pelota(
                jugador,
                Config.posicionarMedio(Config.ANCHO_PANTALLA/2, Config.RADIO_PELOTA),
                Config.ALTO_PANTALLA/4 - Config.RADIO_PELOTA/2,
                Config.RADIO_PELOTA,
                Config.COLOR_PELOTA
        );
        juego.add(pelota);

        int inicioX = 25;
        int inicioY = 30;
        int ancho = 50;
        int alto = 10;
        int hueco = 10;

        for (int filas = 0, posX = inicioX, posY = inicioY; filas < 4; filas++) {
            for (int columnas = 0; columnas < 9; columnas++) {
                Ladrillo ladrillo = new Ladrillo(posX, posY, ancho, alto, Color.black);
                ladrillos.add(ladrillo);
                juego.add(ladrillo);
                posX += ancho + hueco;
            }
            posX = inicioX;
            posY += alto + hueco;
        }



        juego.iniciar();
    }
}
