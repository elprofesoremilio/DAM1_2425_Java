package _03_Clases.G_Enumerados.Francesa;

public class Main {
    public static void main(String[] args) {
        Carta carta = new Carta(Palo.CORAZONES, 1);

        for (Palo palo : Palo.values()) {
            for (int i = 1; i <= 12; i++) {
                System.out.println(i + " de " + palo);
            }
        }

    }
}
