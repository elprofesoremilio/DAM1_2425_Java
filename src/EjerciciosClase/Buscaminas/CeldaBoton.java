package EjerciciosClase.Buscaminas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CeldaBoton extends JButton implements ActionListener {
    private final int fila;
    private final int columna;
    private final BuscaminasSwing vista;

    public CeldaBoton(BuscaminasSwing vista, int fila, int columna) {
        super(" ");
        this.fila = fila;
        this.columna = columna;
        this.vista = vista;
        this.addActionListener(this);
    }

    private void mostrar() {
        JOptionPane.showMessageDialog(null,"Fila: " + fila + "\nColumna: " + columna);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        vista.destapar(fila, columna);
    }
}
