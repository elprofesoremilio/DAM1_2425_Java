package _07_Swing.B_Layouts;

import javax.swing.*;
import java.awt.*;

public class A_BorderLayout extends JFrame {
    private JPanel mainPanel;

    public A_BorderLayout() {
        initComponents();

    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BorderLayout");
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        setContentPane(mainPanel);
        mainPanel.setLayout(new BorderLayout());

        mainPanel.add(new JButton("<html><body>Norte<br>Más norte</body></html>"), BorderLayout.NORTH);
        mainPanel.add(new JButton("Centro"), BorderLayout.CENTER);
        mainPanel.add(new JButton("Este"), BorderLayout.EAST);
        mainPanel.add(new JButton("Sur"), BorderLayout.SOUTH);
        mainPanel.add(new JButton("Oeste"), BorderLayout.WEST);


        // Esto va al final siempre y en ese orden
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new A_BorderLayout();
    }
}
