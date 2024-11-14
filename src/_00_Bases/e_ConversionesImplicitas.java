package _00_Bases;

public class e_ConversionesImplicitas {
    public static void main(String[] args) {
        // Siempre que la conversión sea fácil (no pueda dar excepción) se hace implícitamente
        //  --> cuando la clase que va a recibir el valor contiene a la otra clase
        byte enteroByte = 3;
        int entero = enteroByte;

        short enteroCorto = 32530;
        entero = enteroCorto;

        // un entero corto no puede contener todos los posibles valores de un entero largo, por ejemplo 2348975
        // Lo siguiente si lo descomentas dará error en tiempo de compilación
        // enteroCorto = entero;
        float f = 13.5f;
        double d = f;

        boolean booleano = true;

        char caracter = 'A';
        entero = caracter;

        // Conversión explícita
        System.out.println((int)caracter);

    }
}
