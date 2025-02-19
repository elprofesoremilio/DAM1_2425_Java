package EjerciciosClase.Excepciones.PC;

public class CapacidadRamException extends RAMException {
    public CapacidadRamException() {
        super("La capacidad RAM sería superada si se instalara ese módulo.");
    }
}
