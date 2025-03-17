package EjerciciosClase.Blackjack;

public enum Palo {
    Corazones ("Rojo"),
    Diamantes ("Rojo"),
    Picas ("Negro"),
    Treboles ("Negro");

    private final String color;
    private Palo(String color) {
        this.color = color;
    }
}
