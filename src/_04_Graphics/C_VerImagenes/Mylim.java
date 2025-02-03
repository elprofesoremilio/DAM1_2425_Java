package _04_Graphics.C_VerImagenes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

class Lienzo extends JPanel {
    private BufferedImage player;

    public Lienzo() {
        try {
            File file = new File("src/assets/mylim/idle/1.png");
            player = ImageIO.read(file);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(player,
                this.getWidth()/2 - player.getWidth()/2,
                this.getHeight()/2 - player.getHeight()/2,
                null
        );

    }
}

public class Mylim {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mylim");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,250);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        Lienzo lienzo = new Lienzo();
        frame.setContentPane(lienzo);

        frame.setVisible(true);
    }
}
