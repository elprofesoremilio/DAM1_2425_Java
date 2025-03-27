package _07_Swing.B_Layouts;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class F_GestorEnJFrame extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JTextField campoTextoNombre;
    private JButton botonAceptar;

    public F_GestorEnJFrame() {
        super();
        configurar();
        rellenar();
    }

    private void configurar() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Componentes");
        this.setLocationRelativeTo(null);
        mainPanel = new JPanel();
        this.setContentPane(mainPanel);
    }

    private void rellenar() {
        mainPanel.add(new JLabel("Nombre: "));
        campoTextoNombre = new JTextField(10);
        mainPanel.add(campoTextoNombre);
        JButton botonAceptar = new JButton("Aceptar");
        mainPanel.add(botonAceptar);
        botonAceptar.addActionListener(this);
    }

    private void saludar() {
        JOptionPane.showMessageDialog(mainPanel, "Hola, " + campoTextoNombre.getText(), "Saludos", JOptionPane.INFORMATION_MESSAGE);
    }

    public void iniciar() {
        // Ajustarse al contenido antes de hacer visible
        // Tiene en cuenta el Layout
        this.pack();
        this.setVisible(true);
    }


    public static void main(String[] args) {
        F_GestorEnJFrame frame = new F_GestorEnJFrame();
        frame.iniciar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this,"Hola");
    }
}
