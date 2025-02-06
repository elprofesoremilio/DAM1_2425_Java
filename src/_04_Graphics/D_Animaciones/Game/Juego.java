package _04_Graphics.D_Animaciones.Game;

import javax.swing.*;
import java.awt.*;

public class Juego {
    JFrame ventana;
    public Lienzo lienzo;

    public Juego() {
        ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lienzo = new Lienzo();
        ventana.setContentPane(lienzo);
    }

    public Juego(String title, int anchoPantalla, int altoPantalla) {
        this();
        ventana.setTitle(title);
        ventana.setSize(anchoPantalla,altoPantalla);
    }

    public Juego(String title) {
        this(title, 400,250);
    }

    public void iniciar() {
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

        while (true) {
            lienzo.actualizar();
            lienzo.dibujar();
            lienzo.sincronizar();
        }
    }

    public void maximizar() {
        ventana.setExtendedState(Frame.MAXIMIZED_BOTH);
    }

    public void add(Dibujable objeto) {
        lienzo.dibujables.add(objeto);
    }

    public int getWidth() {
        return lienzo.getWidth();
    }

    public int getHeight() {
        return lienzo.getHeight();
    }
}
