package _06_ExpresionesRegulares;

import java.util.regex.*;

public class IntroduccionRegex {
    public static void main(String[] args) {
        String texto = "El precio es 120 euros y me has dado 150a, te devuelvo 30";
        Pattern patron = Pattern.compile("\\b[a-zA-Z\\d]{2}\\b");
        Matcher matcher = patron.matcher(texto);

        while (matcher.find()) {
            System.out.println("Palabra de dos caracteres encontrada: " + matcher.group());
        }
    }
}
