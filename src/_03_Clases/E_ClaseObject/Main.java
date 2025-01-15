package _03_Clases.E_ClaseObject;

import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal pajarito = new Animal("Piolín", 55);
        System.out.println(pajarito);
        Animal piolin = null;
        System.out.println(pajarito.equals(piolin));
    }
}
