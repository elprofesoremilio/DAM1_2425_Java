package _04_Graphics.Z_Ejemplos.Arkanoid;

import _04_Graphics.Utils.CutrEngine.Juego;

import java.awt.*;

public class Config {
    public static final int RADIO_PELOTA = 25;
    public static final Color COLOR_PELOTA = Color.blue;
    public static final int VELOCIDAD_PELOTA = 2;
    public static int ANCHO_PANTALLA = 600;
    public static int ALTO_PANTALLA = 350;
    public static Juego JUEGO;

    public static int posicionarMedio(int distancia, int longitud) {
        return distancia/2 - longitud/2;
    }
}
