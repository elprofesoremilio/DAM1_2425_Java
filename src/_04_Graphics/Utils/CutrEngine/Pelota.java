package _04_Graphics.Utils.CutrEngine;

import java.awt.*;

public class Pelota implements Dibujable {
    private Point posicion;
    private int radio;
    private Color color;

    public Pelota(int x, int y, int radio, Color color) {
        this.posicion = new Point(x, y);
        this.radio = radio;
        this.color = color;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillOval(posicion.x, posicion.y, radio, radio);
    }

    @Override
    public void actualizar() {
        posicion.y ++;
    }
}
