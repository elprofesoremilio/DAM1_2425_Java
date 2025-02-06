package _04_Graphics.D_Animaciones.Arkanoid;

import _04_Graphics.D_Animaciones.Game.Juego;

public class Arkanoid {
    public static void main(String[] args) {
        Juego juego = Config.JUEGO = new Juego("Arkanoid",Config.ANCHO_PANTALLA,Config.ALTO_PANTALLA);

        juego.add(new Pelota(Config.ANCHO_PANTALLA/2 - Config.RADIO_PELOTA/2,
                Config.ALTO_PANTALLA/4 - Config.RADIO_PELOTA/2,
                Config.RADIO_PELOTA,
                Config.COLOR_PELOTA));

        juego.iniciar();
    }
}
