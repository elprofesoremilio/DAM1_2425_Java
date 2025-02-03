package _04_Graphics.B_PintarEnLienzo;

import javax.swing.*;
import java.awt.*;

public class MinecraftMonkey extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Dibujar la cabeza
        g2d.setColor(new Color(139, 69, 19)); // Color marrón
        g2d.fillRect(50, 50, 100, 100);

        // Dibujar los ojos
        g2d.setColor(Color.WHITE);
        g2d.fillRect(70, 70, 20, 20);
        g2d.fillRect(110, 70, 20, 20);

        g2d.setColor(Color.BLACK);
        g2d.fillRect(75, 75, 10, 10);
        g2d.fillRect(115, 75, 10, 10);

        // Dibujar la boca
        g2d.setColor(Color.BLACK);
        g2d.fillRect(90, 120, 20, 10);

        // Dibujar el cuerpo
        g2d.setColor(new Color(139, 69, 19)); // Color marrón
        g2d.fillRect(75, 150, 50, 100);

        // Dibujar los brazos
        g2d.fillRect(25, 150, 50, 20);
        g2d.fillRect(125, 150, 50, 20);

        // Dibujar las piernas
        g2d.fillRect(75, 250, 20, 50);
        g2d.fillRect(105, 250, 20, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Minecraft Monkey");
        MinecraftMonkey monkey = new MinecraftMonkey();
        frame.add(monkey);
        frame.setSize(200, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}