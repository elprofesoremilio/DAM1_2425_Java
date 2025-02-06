package _04_Graphics.D_Animaciones.Game;

import java.awt.*;

public class Jugador implements Dibujable {
    private Point posicion;
    private int velocidadX;
    private int velocidadY;
    private int ancho;
    private int alto;
    Color color;

    public Jugador(int x, int y, int tamanio, Color color, int velocidadX) {
        posicion = new Point(x,y);
        ancho = tamanio;
        alto = tamanio;
        this.velocidadX = this.velocidadY = velocidadX;
        this.color = color;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillRect(posicion.x, posicion.y, ancho, alto);
    }

    @Override
    public void actualizar() {
        this.posicion.x += velocidadX;
    }
}
