package EjerciciosClase.Gasolinera;

public class Gasolinera {
    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla();
        Coche coche = new Coche("1234ABC", 50, 10, false);
        pantalla.atenderCoche(coche);
    }
}
