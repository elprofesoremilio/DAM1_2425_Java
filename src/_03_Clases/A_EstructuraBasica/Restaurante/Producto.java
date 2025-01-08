package _03_Clases.A_EstructuraBasica.Restaurante;

public class Producto {
    public static final float IVA = 0.21f;
    String nombre;
    float precio;
    boolean femenino;
    float precioFinalConIva;

    void presentarse() {
        if (femenino) {
            System.out.println("Hola, soy una " + nombre + " y cuesto " + precio + "€.");
        } else {
            System.out.println("Hola, soy un " + nombre + " y cuesto " + precio + "€.");
        }
    }
}
