package _04_Graphics.Utils.CutrEngine;

import java.awt.*;

public abstract class Dibujable {
    protected int x, y, ancho, alto, velocidadX, velocidadY;
    protected Color color;
    private Rectangle hitbox;

    public Dibujable(int x, int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        hitbox = new Rectangle(x,y,ancho,alto);
    }

    protected void recalcularHitbox() {
        hitbox = new Rectangle(x,y,ancho,alto);
    }

    abstract public void dibujar(Graphics g);
    abstract public void actualizar();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getVelocidadX() {
        return velocidadX;
    }

    public void setVelocidadX(int velocidadX) {
        this.velocidadX = velocidadX;
    }

    public int getVelocidadY() {
        return velocidadY;
    }

    public void setVelocidadY(int velocidadY) {
        this.velocidadY = velocidadY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void dibujaHitBox(Graphics g) {
        g.setColor(Color.pink);
        g.drawRect(hitbox.x,hitbox.y, hitbox.width, hitbox.height);
    }

    public boolean colisiona(Dibujable dibujable) {
        return this.hitbox.intersects(dibujable.hitbox);
    }
}
