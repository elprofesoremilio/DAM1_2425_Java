package _03_Clases.A_EstructuraBasica;

// Declaramos con visibilidad por defecto (Default)
public class Coche_NoConstructorNiEncapsulamiento {
    // Declarar un atributo --> OJO, incluir siempre la visibilidad
    float velocidad;

    // Al no declarar constructor Java crea uno por defecto Coche(), que no hace nada

    // Declarar un atributo
    public float tiempoEnRecorrer(float distancia) {
        return distancia / velocidad;
    }

}
