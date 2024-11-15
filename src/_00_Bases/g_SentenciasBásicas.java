package _00_Bases;

// Sentencia de declaración de clase
public class g_SentenciasBásicas {
    // Sentencia de declaración de métodos
    public static void main(String[] args) {
        // Declaración de variables --> decir que la variable va a existir
        int a;
        boolean b;
        char c;

        // Definición de variables o sentencias de asignación
        // TODAS las sentencias de asignación son a su vez una expresión del tipo de expresión en el lado derecho
        a = 12;
        b = true;
        c = 'B';

        int paranoia = (a = 13); // debo haber declarado antes la variable a
        int otraParanoia = a = 14; // debo haber declarado antes la variable a

        // Mixta Declaración + Asignación
        float f = 1.2f;

        // Llamadas a métodos
        System.out.println("Hola");

        // Sentencias de ruptura
            // break y cuntinue

        // Sentencias de control

        // Barbaridades variadas
        a=1;b=true;c=3;

    }
}
