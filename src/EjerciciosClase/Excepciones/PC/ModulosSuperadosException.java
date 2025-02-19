package EjerciciosClase.Excepciones.PC;

public class ModulosSuperadosException extends RAMException {
    public ModulosSuperadosException() {
        super("No hay más ranuras disponibles para RAM.");
    }
}
