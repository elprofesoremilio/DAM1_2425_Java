import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Random random = new Random();

        // Primero rellenamos el array con números aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        // Ahora asumimos que el primero es el máximo
        int maximo = numeros[0];
        // Comprobamos si estamos en lo cierto comprobando los demás
        for (int i = 1; i < numeros.length; i++) {
            // Si encontramos una contradicción, un número mayor, asumimos que ese es el máximo
            if (numeros[i]>maximo) {
                maximo = numeros[i];
            }
        }

        System.out.printf("El máximo del array es %d", maximo);

    }
}