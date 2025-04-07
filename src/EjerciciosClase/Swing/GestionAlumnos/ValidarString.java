package EjerciciosClase.Swing.GestionAlumnos;

public class ValidarString {
    public static boolean validarCorreo(String correo) {
        return (correo.matches("([a-z][a-z0-9_.]*)@([a-z][a-z0-9_.]*)[.]([a-z]){2,5}"));
    }
}
