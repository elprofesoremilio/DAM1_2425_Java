package _04_Graphics.B_PintarEnLienzo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame con panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,300,400);

        MiPanel panel = new MiPanel();
        frame.setContentPane(panel);

        frame.setVisible(true);
    }
}
