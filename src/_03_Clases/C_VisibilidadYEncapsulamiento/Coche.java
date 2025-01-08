package _03_Clases.C_VisibilidadYEncapsulamiento;

public class Coche {
    // Declarar un atributo --> OJO, incluir siempre la visibilidad
    private float velocidad;

    // Crear constructor --> public nombreClase(parametros)
    public Coche() {
        velocidad = 0f;
    }

    public Coche(float velocidadNueva) {
        velocidad = velocidadNueva;
    }

    // Declarar un atributo
    public float tiempoEnRecorrer(float distancia) {
        return distancia / velocidad;
    }

    // Getters y Setters
    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float nuevaVelocidad) {
        if (nuevaVelocidad<0) {
            velocidad = 0;
        } else if (nuevaVelocidad>200) {
            velocidad = 200;
        } else {
            velocidad = nuevaVelocidad;
        }
    }
}
