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
    private JPanel panelCentroMinas;
    private JPanel panelPrincipal;
    private JPanel panelNorte;

    public VistaSwing() {
        super("Buscaminas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(370,300);
        this.setLocationRelativeTo(null);
        iniciarTablero();
        this.setVisible(true);
    }

    public void iniciarTablero() {
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelNorte = new JPanel();
        panelPrincipal.add(panelNorte,BorderLayout.NORTH);
        panelNorte.add(new JLabel("010"));
        panelNorte.add(new JLabel("     "));
        panelNorte.add(new JButton(":D"));
        panelNorte.add(new JLabel("     "));
        panelNorte.add(new JLabel("100"));
        this.setContentPane(panelPrincipal);
        buscaminas = new Buscaminas(Tablero.DIFICULTAD_FACIL);
        panelCentroMinas = new JPanel();
        panelPrincipal.add(panelCentroMinas,BorderLayout.CENTER);
        // Para que las celdas aparezcan en una tabla
        rows = buscaminas.getRows();
        columns = buscaminas.getColumns();
        panelCentroMinas.setLayout(new GridLayout(rows,columns));
        tablaCeldas = new CeldaBoton[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                tablaCeldas[row][column] = new CeldaBoton(this, row, column);
                panelCentroMinas.add(tablaCeldas[row][column]);
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
