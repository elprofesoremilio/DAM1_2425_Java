package _06_ExpresionesRegulares;

public class EjemplosRegex {
    public static void main(String[] args) {
        String correo = "usuario1@example.com";
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
        System.out.println("¿Correo válido? " + correo.matches(regex));
        correo = "casa@micasa.tucasita";
        System.out.println("¿Correo válido? " + correo.matches(regex));
    }
}
