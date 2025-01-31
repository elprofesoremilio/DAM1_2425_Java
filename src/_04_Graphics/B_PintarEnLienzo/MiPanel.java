package _04_Graphics.B_PintarEnLienzo;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MiPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Color micolor = new Color(255,255,255);
        g2d.setBackground(micolor);
        g2d.clearRect(0, 0, this.getWidth(), this.getHeight());

        g2d.setColor(Color.RED);
        g2d.fillOval(0, 0, 30, 30);
        g2d.drawOval(0, 50, 30, 30);
        g2d.setColor(Color.BLUE);
        g2d.fillRect(50, 0, 30, 30);
        g2d.fillRect(100, 50, 50, 30);
        g2d.drawRect(50, 50, 30, 30);

        g2d.setColor(Color.GREEN);
        g2d.draw(new Ellipse2D.Double(0, 100, 30, 30));
        g2d.draw(new Ellipse2D.Double(0, 150, 70, 30));



        g2d.clearRect(20,20,75,75);

        // Coordenadas del pentágono
        int[] xPoints = {50, 100, 125, 75, 25};
        int[] yPoints = {100, 100, 150, 200, 150};
        int nPoints = 5;

        // Establecer el color de relleno
        g2d.setColor(Color.PINK);

        // Dibujar el pentágono relleno
        g2d.fillPolygon(xPoints, yPoints, nPoints);
    }
}
