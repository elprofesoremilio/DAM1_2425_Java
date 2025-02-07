package _04_Graphics.Z_Ejemplos.Arkanoid;

import _04_Graphics.Utils.CutrEngine.Dibujable;

import java.awt.*;

public class Jugador extends Dibujable {

    public Jugador(int x, int y, int ancho, int alto, int velocidad, Color color) {
        super(x,y,ancho,alto);
        this.velocidadX = velocidad;
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
