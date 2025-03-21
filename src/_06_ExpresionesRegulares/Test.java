package _06_ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {

        String regex = "([a-zA-Z0-9._%+-]+)@([a-zA-Z0-9.-]+)\\.([a-zA-Z]{2,})";
        String correo = "ejemplo@correo.com";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);

        if (matcher.matches()) {
            System.out.println("Usuario: " + matcher.group(1));
            System.out.println("Dominio: " + matcher.group(2));
            System.out.println("Primer nivel: " + matcher.group(3));
        }
    }

}
