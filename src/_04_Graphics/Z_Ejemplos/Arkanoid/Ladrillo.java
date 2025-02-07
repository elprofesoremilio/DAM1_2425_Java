package _04_Graphics.Z_Ejemplos.Arkanoid;

import _04_Graphics.Utils.CutrEngine.Dibujable;

import java.awt.*;

public class Ladrillo extends Dibujable {

    public Ladrillo(int x, int y, int ancho, int alto, Color color) {
        super(x,y,ancho,alto);
        this.color = color;
    }

    @Override
    public void dibujar(Graphics g) {
        this.dibujaHitBox(g);
        g.setColor(color);
        g.fillRect(x,y,ancho,alto);
    }

    @Override
    public void actualizar() {

    }
}
