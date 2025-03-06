package EjerciciosClase.Buscaminas.Vista;

import EjerciciosClase.Buscaminas.Controlador.Buscaminas;
import EjerciciosClase.Buscaminas.Modelo.Tablero;

import javax.swing.*;
import java.awt.*;

public class VistaSwing extends JFrame {
    private CeldaBoton[][] tablaCeldas;
    private Buscaminas buscaminas;
    private int rows;
    private int columns;

    public VistaSwing() {
        super("Buscaminas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(370,300);
        this.setLocationRelativeTo(null);
        iniciarTablero();
        this.setVisible(true);
    }

    public void iniciarTablero() {
        buscaminas = new Buscaminas(Tablero.DIFICULTAD_FACIL);
        JPanel tableroPanel = new JPanel();
        this.setContentPane(tableroPanel);
        // Para que las celdas aparezcan en una tabla
        rows = buscaminas.getRows();
        columns = buscaminas.getColumns();
        tableroPanel.setLayout(new GridLayout(rows,columns));
        tablaCeldas = new CeldaBoton[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                tablaCeldas[row][column] = new CeldaBoton(this, row, column);
                tableroPanel.add(tablaCeldas[row][column]);
            }
        }
    }


    public void destapar(int row, int column) {
        if (buscaminas.destapar(row, column)) {
            tablaCeldas[row][column].setText("*");
            buscaminas.destaparMinas();
            actualizarVista();
            JOptionPane.showMessageDialog(this, "Has perdido");
        } else {
            if (actualizarVista(row,column)) {
                actualizarVista();
            }

        }
    }

    private boolean actualizarVista(int row, int column) {
        if (buscaminas.isDestapada(row, column)) {
            if (buscaminas.isMina(row, column)) {
                tablaCeldas[row][column].setText("*");
            } else {
                int minasAlrededor = buscaminas.getMinasAlrededor(row, column);
                tablaCeldas[row][column].setText(
                        String.valueOf(minasAlrededor)
                );
                return minasAlrededor == 0;
            }
        }
        return false;
    }

    private void actualizarVista() {
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (buscaminas.isDestapada(row, column)) {
                    actualizarVista(row, column);
                }
            }
        }
    }
}
