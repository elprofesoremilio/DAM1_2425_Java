package _00_Bases;

public class f_ConversionesExplicitas {
    // También llamadas castings
    // Se deben indicar explícitamente porque pueden conllevar consecuencias
    //      * excepción
    //      * pérdida de datos
    public static void main(String[] args) {
        float flotante = 123.23f;

        double doble = (double) flotante;
        flotante = (float) doble;

        long largo = 23049782855464l;
        int entero = (int)largo;
        System.out.println(entero);

        char c = 'A';
        System.out.println(largo);

        double doble2 = (double)23/3;
        int entero2 = (int)1.345/3;


    }
}
