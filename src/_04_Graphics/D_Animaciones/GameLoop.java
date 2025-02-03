package _04_Graphics.D_Animaciones;

import javax.swing.*;
import java.awt.*;

class Lienzo2d extends JPanel {
    private int x=10, y=10;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x,y, 20, 20);
    }

    public void update() {
        x++;
        y++;
    }

    public void draw() {
        this.repaint();
    }
}

public class GameLoop {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Círculo animado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,250);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        Lienzo2d game = new Lienzo2d();
        frame.setContentPane(game);
        frame.setVisible(true);

        while (true) {
            game.update();
            game.draw();
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
