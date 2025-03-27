package _07_Swing.B_Layouts;

import javax.swing.*;
import java.awt.*;

public class CalculadoraGrid extends JFrame {
    public CalculadoraGrid() {
        setTitle("Calculadora GridLayout");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); // Usamos BorderLayout para organizar mejor

        // Campo de texto para los números
        JTextField pantalla = new JTextField();
        pantalla.setEditable(false); // Solo lectura
        add(pantalla, BorderLayout.NORTH); // Colocamos arriba

        // Panel para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4, 5, 5)); // 4 filas, 4 columnas, separación 5px

        // Array con los textos de los botones
        String[] botones = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        // Añadir los botones al panel
        for (String texto : botones) {
            panelBotones.add(new JButton(texto));
        }

        add(panelBotones, BorderLayout.CENTER); // Colocamos el panel en el centro
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculadoraGrid();
    }
}