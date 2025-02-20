package EjerciciosClase.Instituto;

import java.time.LocalDate;

public class Estudiante {
    private String nombre;
    private LocalDate fechaNacimiento;
    private Matricula matricula;

    public Estudiante(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.matricula = matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
}
