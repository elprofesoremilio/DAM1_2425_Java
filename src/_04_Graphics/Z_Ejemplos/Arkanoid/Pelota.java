package _04_Graphics.Z_Ejemplos.Arkanoid;

import _04_Graphics.Utils.CutrEngine.Dibujable;
import _04_Graphics.Utils.CutrEngine.Juego;

import java.awt.*;

public class Pelota implements Dibujable {
    private int x, y;
    private int radio;
    private Color color;
    private int velocidadX, velocidadY;
    private Juego juego = Config.JUEGO;
    private Jugador jugador;

    public Pelota(Jugador jugador, int x, int y, int radio, Color color) {
        this.jugador = jugador;
        this.x = x;
        this.y = y;
        this.radio = radio;
        this.color = color;
        velocidadX = Config.VELOCIDAD_PELOTA;
        velocidadY = Config.VELOCIDAD_PELOTA;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radio, radio);
    }

    @Override
    public void actualizar() {
        if (y + velocidadY > juego.getHeight() - radio || y + velocidadY < 0) {
            velocidadY = -velocidadY;
        }
        if (x + velocidadX > juego.getWidth() - radio || x + velocidadX < 0) {
            velocidadX = -velocidadX;
        }

        y += velocidadY;
        x += velocidadX;
    }
}
