package _04_Graphics.Z_Ejemplos.Arkanoid;

import _04_Graphics.Utils.CutrEngine.Dibujable;

import java.awt.*;

public class Ladrillo implements Dibujable {
    private int x, y, ancho, alto;
    private Color color;

    public Ladrillo(int x, int y, int ancho, int alto, Color color) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
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
