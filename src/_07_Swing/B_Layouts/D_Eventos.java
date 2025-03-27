package _07_Swing.B_Layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class D_Eventos extends JFrame {
    private JPanel mainPanel;

    public D_Eventos() {
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
        mainPanel.add(new JTextArea(10,30), gbc);

        gbc.fill = GridBagConstraints.NONE;
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = gbc.gridheight = 1;
        gbc.weightx = gbc.weighty = 0;
        JButton boton1 = new JButton("Botón 1");
        mainPanel.add(boton1, gbc);
        boton1.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,"Hola botón 1");
        });


        gbc.gridy = 1;
        JButton boton2 = new JButton("Botón 2");
        mainPanel.add(boton2, gbc);
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hola botón 2");
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 2;
        JButton boton3 = new JButton("Botón 3");
        mainPanel.add(boton3, gbc);
        boton3.addActionListener(new GestorInterno());


        gbc.gridx = 2;
        JButton boton4 = new JButton("Botón 4");
        mainPanel.add(boton4, gbc);
        boton4.addActionListener(new D_GestorExterno());

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

        D_Eventos f1 = new D_Eventos();

    }

    static class GestorInterno implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"Hola botón 3");
        }
    }
}

