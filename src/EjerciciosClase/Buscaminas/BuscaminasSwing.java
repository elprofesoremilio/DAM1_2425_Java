package EjerciciosClase.Buscaminas;

import javax.swing.*;
import java.awt.*;

public class BuscaminasSwing extends JFrame {
    private Tablero tablero;
    private CeldaBoton[][] tablaCeldas;
    private int rows;
    private int columns;

    public BuscaminasSwing() {
        super("Buscaminas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(370,300);
        this.setLocationRelativeTo(null);
        iniciarTablero();
        this.setVisible(true);
    }

    public void iniciarTablero() {
        tablero = new Tablero(Tablero.DIFICULTAD_FACIL);
        tablero.crearTablero();
        JPanel tableroPanel = new JPanel();
        this.setContentPane(tableroPanel);
        // Para que las celdas aparezcan en una tabla
        rows = tablero.getRows();
        columns = tablero.getColumns();
        tableroPanel.setLayout(new GridLayout(rows,columns));
        tablaCeldas = new CeldaBoton[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                tablaCeldas[row][column] = new CeldaBoton(this, row, column);
                tableroPanel.add(tablaCeldas[row][column]);
            }
        }
    }

    public static void main(String[] args) {
        new BuscaminasSwing();
    }

    public void destapar(int fila, int columna) {
        if (tablero.destapar(fila, columna)) {
            tablaCeldas[fila][columna].setText("*");
        } else {
            String result = tablero.getInfoMina(fila,columna);
            tablaCeldas[fila][columna].setText(result);
            if (result.equals("0")) {
                actualizarVista();
            }
        }
    }

    private void actualizarVista() {
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (tablero.isDestapada(row, column)) {
                    String result = tablero.getInfoMina(row,column);
                    tablaCeldas[row][column].setText(result);
                }
            }
        }
    }
}
