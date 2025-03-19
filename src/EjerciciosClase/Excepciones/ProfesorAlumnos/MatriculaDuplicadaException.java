package EjerciciosClase.Excepciones.ProfesorAlumnos;

public class MatriculaDuplicadaException extends Exception {
    public MatriculaDuplicadaException() {
        super("Imposible crear matrícula: duplicada");
    }
}
