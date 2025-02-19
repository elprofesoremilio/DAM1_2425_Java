package _05_Excepciones.Persona;

public class EdadInvalidaException extends Exception {
    public EdadInvalidaException() {
        super("Edad incorrecta, la edad tiene que estar entre 0 y 130");
    }

    public EdadInvalidaException(String message) {
        super(message);
    }

    public EdadInvalidaException(int error) {
        super(
                error < 0 ? "No se permiten edades negativas" : "Edades mayores que 130 no me las creo"
        );
    }
}
