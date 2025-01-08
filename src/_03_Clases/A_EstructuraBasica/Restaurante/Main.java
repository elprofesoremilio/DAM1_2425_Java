package _03_Clases.A_EstructuraBasica.Restaurante;

public class Main {
    public static void main(String[] args) {
        Cliente paco = new Cliente("Paco", 21);
        Producto cafe = new Producto();

        cafe.nombre = "Café solo";
        cafe.precio = 1.5f;

        paco.presentarse();
        cafe.presentarse();
    }
}
