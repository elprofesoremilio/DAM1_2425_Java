package _01_Clases.C_VisibilidadYEncapsulamiento;

public class Main {
    public static void main(String[] args) {
        // Declaración del objeto
        Coche miCoche, tuCoche;
        miCoche = new Coche(50f);
        tuCoche = new Coche(90f);

        System.out.println("Mi coche, que va a " + miCoche.getVelocidad()
                + "Km/h, tarda " + miCoche.tiempoEnRecorrer(100) + "hrs.");

        tuCoche.setVelocidad(350);

        System.out.println("Tu coche, que va a " + tuCoche.getVelocidad()
                + "Km/h, tarda " + tuCoche.tiempoEnRecorrer(100) + "hrs.");

    }
}
