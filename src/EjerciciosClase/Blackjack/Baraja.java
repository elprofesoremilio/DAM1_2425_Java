package EjerciciosClase.Blackjack;

import java.util.LinkedList;
import java.util.List;

public class Baraja {
    List<Carta> cartas;

    public Baraja() {
        cartas = new LinkedList<>();
        for (Palo palo : Palo.values()) {
            for (Numero numero : Numero.values()) {
                cartas.add(new Carta(palo,numero));
            }
        }
    }
}
