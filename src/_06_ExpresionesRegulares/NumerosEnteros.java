package _06_ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumerosEnteros {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?<!\\w)-?\\d+\\b");
        Matcher matcher = pattern.matcher("Hola22 -150 mun33do 123");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
