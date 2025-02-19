package EjerciciosClase.Excepciones.PC;

public class VelocidadIncompatibleException extends RAMException {
    public VelocidadIncompatibleException() {
        super("La velocidad del módulo a instalar no es compatible.");
    }
}
