package EjerciciosClase.Buscaminas.Controlador;

import EjerciciosClase.Buscaminas.Modelo.Celda;
import EjerciciosClase.Buscaminas.Modelo.Tablero;

public class Buscaminas {
    private Tablero tablero;

    public Buscaminas(int dificultad) {
        tablero = new Tablero(dificultad);
        tablero.crearTablero();
    }

    public int getColumns() {
        return tablero.getColumns();
    }

    public int getRows() {
        return tablero.getRows();
    }

    public boolean isDestapada(int row, int column) {
        return tablero.isDestapada(row, column);
    }

    public boolean isMina(int row, int column) {
        return tablero.isMina(row, column);
    }

    public int getMinasAlrededor(int row, int column) {
        return tablero.getMinasAlrededor(row, column);
    }

    public boolean destapar(int row, int col) {
        return tablero.destapar(row, col);
    }

    public boolean calcularResultado() {
        return tablero.calcularResultado();
    }


    public void destaparMinas() {
        tablero.destaparMinas();
    }
}
