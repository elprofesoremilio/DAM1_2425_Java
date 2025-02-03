package _04_Graphics.D_Animaciones;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

class Lienzo extends JPanel {
    private BufferedImage playerOpenedEye, playerClosedEye, player;
    private static final int SPEED=1;
    private int x=10, y=10;
    private int contador;

    public Lienzo() {
        contador = 0;
        try {
            File file = new File("src/assets/mylim/idle/1.png");
            playerOpenedEye = ImageIO.read(file);
            // Creamos un objeto anónimo para el archivo
            playerClosedEye = ImageIO.read(new File("src/assets/mylim/idle/2.png"));
            player = playerOpenedEye;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(player, x, y,null);
    }

    public void update() {
        contador++;
        x += SPEED;
        if (contador==60) {
            contador = 0;
            if (player == playerOpenedEye) {
                player = playerClosedEye;
            } else {
                player = playerOpenedEye;
            }
        }
    }
}

public class Mylim {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mylim");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,250);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        Lienzo game = new Lienzo();
        frame.setContentPane(game);

        frame.setVisible(true);

        while (true) {
            game.update();
            game.repaint();
            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
