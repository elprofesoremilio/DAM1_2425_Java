package _04_Graphics.Utils.CutrEngine;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class Lienzo extends JPanel {
    public LinkedList<Dibujable> dibujables;

    public Lienzo() {
        dibujables = new LinkedList<>();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Dibujable d : dibujables) {
            d.dibujar(g);
        }
    }

    public void actualizar() {
        for (Dibujable d : dibujables) {
            d.actualizar();
        }
    }

    public void sincronizar() {
        try {
            Thread.sleep(15);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void dibujar() {
        this.repaint();
    }
}
