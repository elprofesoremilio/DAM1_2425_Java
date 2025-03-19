package EjerciciosClase.Excepciones.ProfesorAlumnos;

public class Main {
    public static void main(String[] args) {
        Profesor profe = new Profesor();

        try {
            profe.add(1,"Pérez", "Antonio");
            System.out.println("Añadido");
        } catch (MatriculaDuplicadaException e) {
            System.err.println(e.getMessage());
        }
        try {
            profe.add(1,"Pérez", "Antonio");
        } catch (MatriculaDuplicadaException e) {
            System.err.println(e.getMessage());
        }

        try {
            profe.remove("Pérez", "Antonio");
            System.out.println("Eliminado");
        } catch (AlumnoInexistenteException e) {
            System.err.println(e.getMessage());
        }
        try {
            profe.remove("Pérez", "Antonio");
        } catch (AlumnoInexistenteException e) {
            System.err.println(e.getMessage());
        }
    }
}
