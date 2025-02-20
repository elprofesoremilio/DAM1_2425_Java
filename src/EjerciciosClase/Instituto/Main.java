package EjerciciosClase.Instituto;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Pepe", LocalDate.of(2005,03,13));
        Matricula matricula = new Matricula(1, LocalDate.now());
        estudiante.setMatricula(matricula);
        matricula.setEstudiante(estudiante);
    }
}
