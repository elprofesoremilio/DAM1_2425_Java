package _04_Graphics.Z_Ejemplos.Arkanoid;

import _04_Graphics.Utils.CutrEngine.Dibujable;

import java.awt.*;

public class Jugador implements Dibujable {
    private int x, y, ancho, alto, velocidad;
    Color color;

    public Jugador(int x, int y, int ancho, int alto, int velocidad, Color color) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.velocidad = velocidad;
        this.color = color;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillRect(x,y,ancho,alto);
    }

    @Override
    public void actualizar() {

    }
}
