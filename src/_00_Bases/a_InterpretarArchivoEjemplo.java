// Paquete (por ahora podemos llamarlo carpeta) al que pertenece el archivo
package _00_Bases;

// Comentarios con solo una línea
/*
*   Comentarios con varias líneas, empiezan con barra asterisco y terminan
*   con asterisco barra
*
*   Los comentarios no se tienen en cuenta por el compilador, nos sirven
*   para documentar el código, hacer anotaciones, aclarar por qué hacemos
*   algo, etc.
*/

/**
 * Este comentario que empieza con barra y doble asterisco es especial
 * Significa que se empieza documentación del código en JAVADOC
 * @author elProfesorEmilio
 */

/*
    Declaración de la clase/archivo
    Tened en cuenta que en Java, un archivo se tiene que llamar igual que
    la clase, es decir, el nombre correcto para un archivo que contenga
    este código sería a_InterpretarArchivoEjemplo.java
*/

/**
 * Clase que sirve para enseñar la sintaxis básica de una clase 'ejecutable' en Java
 */
public class a_InterpretarArchivoEjemplo {      // abrir llave = inicio de bloque

    // def main(args):
    //      resultado = args*2
    //      return resultado

    // visibilidad modificadores claseDevuelta nombreMetodo(claseParametro1 nombreParametro1, .... ) {
    // visibilidad es opcional
    // modificadores (static final) son opcionales
    // número de parámetros entre 0 y los que se necesiten
    // si quiero poner 0 parámetros, simplemente abro y cierro paréntesis ()
    public static void main(String[] args) {
        // Método principal de una aplicación
        // Sin este método no podréis ejecutar código directamente

        // print("Hello and w")
        // Instrucción de escribir por salida estándar
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hola mundo " + i);
        }
    }
}    //   llave de cierre de bloque, definición de la clase