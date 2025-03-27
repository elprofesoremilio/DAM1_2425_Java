package _07_Swing.B_Layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class F_GestorMultipleFrame extends JFrame implements ActionListener {
    private JPanel mainPanel;

    public F_GestorMultipleFrame() {
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


        gbc.gridy = 1;
        JButton boton2 = new JButton("Botón 2");
        mainPanel.add(boton2, gbc);


        gbc.gridx = 0;
        gbc.gridy = 2;
        JButton boton3 = new JButton("Botón 3");
        mainPanel.add(boton3, gbc);


        gbc.gridx = 2;
        JButton boton4 = new JButton("Botón 4");
        mainPanel.add(boton4, gbc);

        gbc.weightx = 100;
        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(new JTextField("Campo texto"), gbc);

        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);

        // Termina la fiesta
        // Esto va al final siempre y en ese orden
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        F_GestorMultipleFrame f1 = new F_GestorMultipleFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource();
        String numero = "";
        switch (boton.getText()) {
            case "Botón 1": numero = "1"; break;
            case "Botón 2": numero = "2"; break;
            case "Botón 3": numero = "3"; break;
            case "Botón 4": numero = "4"; break;
        }
        JOptionPane.showMessageDialog(this,"Hola botón " + numero);
    }

}

