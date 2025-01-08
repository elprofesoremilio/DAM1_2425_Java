package _03_Clases.B_Constructores;

public class Main {
    public static void main(String[] args) {
        // Declaración del objeto
        Coche_SinEncapsulamiento miCoche, tuCoche;
        miCoche = new Coche_SinEncapsulamiento(50f);
        tuCoche = new Coche_SinEncapsulamiento();

        System.out.println("Mi coche, que va a " + miCoche.velocidad
                + "Km/h, tarda " + miCoche.tiempoEnRecorrer(100) + "hrs.");

        tuCoche.velocidad=350f;

        System.out.println("Tu coche, que va a " + tuCoche.velocidad
                + "Km/h, tarda " + tuCoche.tiempoEnRecorrer(100) + "hrs.");

    }
}
