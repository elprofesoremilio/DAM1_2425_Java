package EjerciciosClase.Parejas;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int numeroParejas;
    private List<Carta> cartas;

    public Mesa(int numeroParejas) {
        cartas = new ArrayList<>(numeroParejas*2);
        crearCartas();
    }

    private void crearCartas() {
        // TODO Mesa.crearCartas
    }

    public void colocarCartas() {
        // TODO Mesa.colocarCartas

    }
}
