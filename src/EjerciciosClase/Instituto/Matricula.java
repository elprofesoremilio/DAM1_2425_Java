package EjerciciosClase.Instituto;

import java.time.LocalDate;

public class Matricula {
    private int id;
    private LocalDate fecha;
    private Estudiante estudiante;

    public Matricula(int id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
