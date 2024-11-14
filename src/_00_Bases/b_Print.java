/* Aprendiendo a programar en DAM con elProfesorEmilio */
package _00_Bases;

/**
 * @author elProfesorEmilio
 * Salida de datos básica por consola
 */
public class b_Print {

    public static void main(String[] args) {
        
        // Instrucción para escribir un String con salto de línea al final
        System.out.print("Hola");
        // Al eliminar ln de println no se escribe salto al final
        System.out.print(" amigo \n" // Sin embargo lo puedo añadir con \n
                + "Esto es otra línea\n" // Veis que al poner + se concatena
                + "\t Empieza con tabulador\n" // Tabulador
                + "Y esto otra con una barra \\");

        // Existen varios caracteres especiales -->
        //            \n: Nueva línea (salto de línea).
        //            \r: Retorno de carro.
        //            \f: Salto de página.
        //            \': Comilla simple.
        //            \": Comilla doble.
        //            \\: Barra invertida (backslash).

        System.out.println("C:\\Users\\Emilio"); // Ojo con los archivos y la barra
        
        System.out.print("\nHola, esto es una prueba \ntodo está en la mismas comillas\n");

        String nombre = "Emilio";
        
        System.out.println("Hola " + nombre);

        // La instrucción printf funciona como print normal pero podemos
        // hacer más cosas que veremos en un futuro
        System.out.printf("\nOtra instrucción más: Hola %s\n", nombre); // %s --> s de String
        System.out.printf("%s, %s, %d, %f \n", "Hola", "Pepe", 3, 0.3); // String, números enteros, números con decimales
        
        /* Podemos usar colores para la consola
            ANSI_RESET = "\u001B[0m";
            ANSI_BLACK = "\u001B[30m";
            ANSI_RED = "\u001B[31m";
            ANSI_GREEN = "\u001B[32m";
            ANSI_YELLOW = "\u001B[33m";
            ANSI_BLUE = "\u001B[34m";
            ANSI_PURPLE = "\u001B[35m";
            ANSI_CYAN = "\u001B[36m";
            ANSI_WHITE = "\u001B[37m";
        
        */ 
        
        System.out.println("Texto en \u001B[31mrojo\u001B[0m y en normal");
        
    }
    
}
