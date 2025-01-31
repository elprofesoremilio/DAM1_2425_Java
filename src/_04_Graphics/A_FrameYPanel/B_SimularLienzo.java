package _04_Graphics.A_FrameYPanel;

import javax.swing.*;

public class B_SimularLienzo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame con panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,300,150);

        JPanel panel = new JPanel();
        frame.setContentPane(panel);
        panel.add(new JLabel("Hola"));
        panel.add(new JButton("Pulsa"));

        frame.setVisible(true);
    }
}
