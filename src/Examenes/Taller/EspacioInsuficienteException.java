package Examenes.Taller;

public class EspacioInsuficienteException extends TallerException {
    public EspacioInsuficienteException() {
        super("El coche no cabe.");
    }
}
