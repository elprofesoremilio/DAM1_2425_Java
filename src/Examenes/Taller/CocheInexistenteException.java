package Examenes.Taller;

public class CocheInexistenteException extends TallerException {
    public CocheInexistenteException() {
        super("Coche no encontrado");
    }
}
