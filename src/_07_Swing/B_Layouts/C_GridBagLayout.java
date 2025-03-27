package _07_Swing.B_Layouts;

import javax.swing.*;
import java.awt.*;

public class C_GridBagLayout extends JFrame {
    private JPanel mainPanel;

    public C_GridBagLayout() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("GridBagLayout");

        mainPanel = new JPanel();
        setContentPane(mainPanel);
        mainPanel.setLayout(new GridBagLayout());

        // Empieza la fiesta

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = gbc.gridy = 0;
        gbc.gridwidth = gbc.gridheight = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = gbc.weighty = 1;
        mainPanel.add(new JTextArea(20,10), gbc);

        gbc.fill = GridBagConstraints.NONE;
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = gbc.gridheight = 1;
        gbc.weightx = gbc.weighty = 0;
        mainPanel.add(new JButton("Botón 1"), gbc);

        gbc.gridy = 1;
        mainPanel.add(new JButton("Botón 2"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        mainPanel.add(new JButton("Botón 3"), gbc);


        gbc.gridx = 2;
        mainPanel.add(new JButton("Botón 4"), gbc);

        gbc.weightx = 100;
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(new JTextField("Campo texto"), gbc);
        // Termina la fiesta
        // Esto va al final siempre y en ese orden
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new C_GridBagLayout();
    }
}
