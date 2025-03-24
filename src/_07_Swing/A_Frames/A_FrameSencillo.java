package _07_Swing.A_Frames;

import javax.swing.*;

public class A_FrameSencillo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hola mundo");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
