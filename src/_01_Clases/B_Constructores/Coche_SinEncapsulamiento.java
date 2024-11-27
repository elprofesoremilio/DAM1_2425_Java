package _01_Clases.B_Constructores;

public class Coche_SinEncapsulamiento {
    // Declarar un atributo
    float velocidad;

    // Crear constructor --> public nombreClase(parametros)
    public Coche_SinEncapsulamiento() {
        velocidad = 0f;
    }

    public Coche_SinEncapsulamiento(float velocidadNueva) {
        velocidad = velocidadNueva;
    }

    // Declarar un atributo
    public float tiempoEnRecorrer(float distancia) {
        return distancia / velocidad;
    }

}
