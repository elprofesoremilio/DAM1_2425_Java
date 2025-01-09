package EjerciciosClase.ClasesYObjetos.Gasolinera;

public class Surtidor {
    private float capacidad;
    private float litrosSurtidor;
    private float precioLitro;
    private float litrosSurtidosCoche;

    public Surtidor(float capacidad, float precioLitro) {
        this.capacidad = capacidad;
        this.precioLitro = precioLitro;
        this.litrosSurtidosCoche = 0;
        this.litrosSurtidor = capacidad;
    }

    public float calcularImporte() {
        return precioLitro * litrosSurtidosCoche;
    }

    public float llenarDeposito(Coche coche) {
        litrosSurtidosCoche = coche.llenarDeposito();
        if (litrosSurtidosCoche>0) {
            litrosSurtidor -= litrosSurtidosCoche;
        }  else {
            litrosSurtidosCoche = -1;
        }
        return litrosSurtidosCoche;
    }

    public float surtirLitros(float litros, Coche coche) {
        litrosSurtidosCoche = coche.cargarCombustible(litros);
        return litrosSurtidosCoche;
    }

    public float surtirPorPrecio(float importe, Coche coche) {
        float litrosALlenar = importe / precioLitro;
        if (litrosALlenar < litrosSurtidor) {
            litrosSurtidosCoche = coche.cargarCombustible(litrosALlenar);
        } else {
            litrosSurtidosCoche = -1;
        }
        return litrosSurtidosCoche;
    }

    public float getLitrosSurtidos() {
        return litrosSurtidosCoche;
    }
}
