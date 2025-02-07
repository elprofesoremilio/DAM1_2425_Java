package _04_Graphics.Z_Ejemplos.Arkanoid;

import _04_Graphics.Utils.CutrEngine.Dibujable;
import _04_Graphics.Utils.CutrEngine.Juego;

import java.awt.*;

public class Pelota extends Dibujable {
    private int radio;
    private Point centro;
    private Juego juego = Config.JUEGO;
    private Jugador jugador;

    public Pelota(Jugador jugador, int x, int y, int radio, Color color) {
        // Nene, si dibujas un óvalo no multipliques por 2
        super(x-radio, y-radio, radio, radio);
        this.jugador = jugador;
        this.centro = new Point(x, y);
        this.radio = radio;
        this.color = color;
        velocidadX = Config.VELOCIDAD_PELOTA;
        velocidadY = Config.VELOCIDAD_PELOTA;
    }

    @Override
    protected void recalcularHitbox() {
        this.x = centro.x;
        this.y = centro.y;
        super.recalcularHitbox();
    }

    @Override
    public void dibujar(Graphics g) {
        this.dibujaHitBox(g);
        g.setColor(color);
        g.fillOval(centro.x, centro.y, radio, radio);
    }

    @Override
    public void actualizar() {

        if (centro.y + velocidadY > juego.getHeight() - radio || centro.y + velocidadY < 0) {
            velocidadY = -velocidadY;
        }
        if (centro.x + velocidadX > juego.getWidth() - radio || centro.x + velocidadX < 0) {
            velocidadX = -velocidadX;
        }

        if (this.colisiona(jugador)) {
            velocidadY = -velocidadY;
        }

//        if (x + radio>jugador.getX() && x < jugador.getX()+jugador.getAncho()) {
//            if (y + radio>jugador.getY() && y < jugador.getY() + jugador.getAlto()) {
//                velocidadY = -velocidadY;
//            }
//        }

        centro.y += velocidadY;
        centro.x += velocidadX;
        recalcularHitbox();

    }
}
