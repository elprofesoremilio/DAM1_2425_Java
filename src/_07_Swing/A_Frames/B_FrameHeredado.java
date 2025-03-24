package _07_Swing.A_Frames;

import javax.swing.*;

public class B_FrameHeredado extends JFrame {
    public B_FrameHeredado() {
        this("");
    }

    public B_FrameHeredado(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new B_FrameHeredado();
    }
}
