package _04_Graphics.D_Animaciones.Arkanoid;

import _04_Graphics.D_Animaciones.Game.Dibujable;
import _04_Graphics.D_Animaciones.Game.Juego;

import java.awt.*;

public class Pelota implements Dibujable {
    private int x, y;
    private int radio;
    private Color color;
    private int velocidadX, velocidadY;
    private Juego juego = Config.JUEGO;

    public Pelota(int x, int y, int radio, Color color) {
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
