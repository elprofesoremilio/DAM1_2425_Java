package EjerciciosClase.PintarYAnimar;

import javax.swing.*;

public class Ventana {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujo");
        ventana.setSize(800,600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel = new Panel();
        ventana.add(panel);

        ventana.setVisible(true);
    }
}
