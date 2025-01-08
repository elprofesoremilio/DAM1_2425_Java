package _03_Clases.A_EstructuraBasica.Restaurante;

public class Cliente {
    String nombre;
    int mesa;

    void presentarse() {
        System.out.println("Hola, soy " + nombre + " y estoy en la mesa " + mesa + ".");
    }
}
