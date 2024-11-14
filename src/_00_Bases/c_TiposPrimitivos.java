/* 
*
* Aprendiendo a programar en DAM con Emilio 
* elProfesorEmilio@gmail.com
*
 */
package _00_Bases;

/**
 * @author Emilio
 */
public class c_TiposPrimitivos {

    public static void main(String[] args) {

        // En Java siempre se debe indicar el tipo de una variable. Siempre.
        // Esto se hace en la sentencia de tipo declaración y/o en la de definición.
        // Sentencia declaración -> reservamos memoria para una variable
        boolean variable;
        // Sentencia de definición cuando ya existe la variable
        variable = false;
        // Sentencia de declaración y definición unificada
        boolean variable2 = true;

        // En la misma sentencia de declaración puedo declarar varias variables --> del mismo tipo
        boolean soy_booleano,
            soy_otra_booleana = true;
        
        soy_booleano = true;

        // El método print espera siempre un String, por lo tanto hará siempre que pueda conversión implícita
        System.out.println(soy_booleano + "\n" + soy_otra_booleana);
        
        int entero = Integer.MAX_VALUE;
        System.out.println(entero);

        long entero_largo = Long.MAX_VALUE;
        System.out.println(entero_largo);
        
        short entero_corto = Short.MAX_VALUE;
        System.out.println(entero_corto);
        
        byte entero_peque = Byte.MAX_VALUE;
        System.out.println(entero_peque);

        // Números con poca precisión, pocos decimales
        float flotante = 2.895f + 1.984f;
        System.out.println(flotante);

        // Números con mayor precisión y tamaño
        double doble = 3.524;
        System.out.println(doble);

        char c = 'a';
        System.out.println(c);


        // Precisión
        double d1 = 10.0;
        double d2 = 3.0;
        double d = d1/d2;
        System.out.println("double d : "+d);

        float f1 = 10.0f;
        float f2 = 3.0f;
        float f = f1/f2;
        System.out.println("float f : "+f);

        float f3 = (float) d;
        System.out.println("float f3 : "+f3);

        double d3 = f;
        System.out.println( "double d3 : "+d3);

    }
}
