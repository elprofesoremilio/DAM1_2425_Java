package EjerciciosClase.Buscaminas;

public class Tablero {
    private Casilla[][] casillas;

    public Tablero(int dificultad) {
        int ladoTablero = dificultad*20;
        casillas = new Casilla[ladoTablero][ladoTablero];
    }

    public void destaparCasilla(int fila, int columna) {

    }

    public void destaparMinas() {

    }

    public void marcarCasilla(int fila, int columna) {
        casillas[fila][columna].marcar();
    }
}
