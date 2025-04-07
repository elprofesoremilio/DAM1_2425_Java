package EjerciciosClase.Swing.GestionAlumnos;

public class ValidarString {
    public static boolean validarCorreo(String dato) {
        return (dato.matches("([a-z][a-z0-9_.]*)@([a-z][a-z0-9_.]*)[.]([a-z]){2,5}"));
    }

    public static boolean validarEdad(String dato) {
        return (dato.matches("\"[1-9][0-9]?\""));
    }

    public static boolean validarNombre(String dato) {
        return (dato.matches("\"[1-9][0-9]?\""));
    }

}
