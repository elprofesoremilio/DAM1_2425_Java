package EjerciciosClase.Oca;

public class Tablero {
    private Casilla[] tablero;
    private Ficha[] fichas;

    public Tablero(int jugadores) {
        // TODO Tablero
        tablero = new Casilla[63];
        completarTablero();
        fichas = new Ficha[jugadores];
        crearFichas();
    }

    private void crearFichas() {
        // TODO crearFichas
    }

    private void completarTablero() {
        // TODO completarTablero
    }
}
