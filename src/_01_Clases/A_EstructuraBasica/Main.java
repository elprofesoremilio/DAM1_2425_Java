package _01_Clases.A_EstructuraBasica;

public class Main {
    public static void main(String[] args) {
        // Declaración del objeto
        Coche_NoConstructorNiEncapsulamiento miCoche, tuCoche;
        miCoche = new Coche_NoConstructorNiEncapsulamiento();
        tuCoche = new Coche_NoConstructorNiEncapsulamiento();

        miCoche.velocidad = 50f;

        System.out.println("Mi coche, que va a " + miCoche.velocidad
                + "Km/h, tarda " + miCoche.tiempoEnRecorrer(100) + "hrs.");

        tuCoche.velocidad = 90f;

        System.out.println("Tu coche, que va a " + tuCoche.velocidad
                + "Km/h, tarda " + tuCoche.tiempoEnRecorrer(100) + "hrs.");

    }
}
