package _02_ClasesGenerales;

public class A_ClaseString {
    public static void main(String[] args) {
        String cadena = "En un lugar de la Mancha, de cuyo " +
                "nombre no quiero acordarme, " +
                "vivía un hidalgo...";

        System.out.println("Longitud de la cadena = " + cadena.length());
        System.out.println("El carácter de la posición 8 es: " + cadena.charAt(8));

        int contador = 0;
        // for (inicialización; condición; incremento)
        for (int i = 0; i<cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                contador++;
            }
        }
        int numeroPalabras = contador + 1;
        System.out.println("En el texto hay " + numeroPalabras + " palabras.");

        String texto1 = "casa", texto2 = "patata", texto3 = "casa";
        System.out.print(texto3);

        System.out.println(texto1.equals(texto3));


    }
}
