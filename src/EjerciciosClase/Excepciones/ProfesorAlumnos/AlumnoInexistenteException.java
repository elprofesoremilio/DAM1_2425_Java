package EjerciciosClase.Excepciones.ProfesorAlumnos;

public class AlumnoInexistenteException extends Exception {
    public AlumnoInexistenteException() {
        super("Alumno inexistente.");
    }
}
