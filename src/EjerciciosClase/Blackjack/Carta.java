package EjerciciosClase.Blackjack;

public class Carta {
    Palo palo;
    Numero numero;

    public Carta(Palo palo, Numero numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }
}
