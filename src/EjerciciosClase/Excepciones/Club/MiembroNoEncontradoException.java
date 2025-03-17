package EjerciciosClase.Excepciones.Club;

public class MiembroNoEncontradoException extends Exception {
    public MiembroNoEncontradoException(String mensaje) {
        super(mensaje);
    }

    public MiembroNoEncontradoException() {
        super("El miembro no existe.");
    }
}
