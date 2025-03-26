package _07_Swing.B_Layouts;

import javax.swing.*;
import java.awt.*;

public class B_GridLayout extends JFrame {
    private JPanel mainPanel;

    public B_GridLayout() {
        initComponents();

    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BorderLayout");
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        setContentPane(mainPanel);
        mainPanel.setLayout(new GridLayout(3,2, 1, 1));

        mainPanel.add(new JButton("<html><body>Norte<br>Más norte</body></html>"));
        mainPanel.add(new JButton("Centro"));
        mainPanel.add(new JButton("Este"));
        mainPanel.add(new JButton("Sur"));
        mainPanel.add(new JButton("Oeste"));
        mainPanel.add(new JButton("Otros"));


        // Esto va al final siempre y en ese orden
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new B_GridLayout();
    }
}
