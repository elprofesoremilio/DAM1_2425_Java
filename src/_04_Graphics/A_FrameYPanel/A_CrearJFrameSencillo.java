package _04_Graphics.A_FrameYPanel;

import javax.swing.*;

public class A_CrearJFrameSencillo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Mi primer Frame");

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,300,150);
        f.setVisible(true);
    }
}
