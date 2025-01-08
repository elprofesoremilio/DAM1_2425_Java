package _03_Clases.A_EstructuraBasica.Restaurante;

public class Main {
    public static void main(String[] args) {
        Cliente paco = new Cliente();

        paco.nombre = "Paco";
        paco.mesa = 21;

        paco.presentarse();
    }
}
