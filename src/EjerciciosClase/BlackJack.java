package EjerciciosClase;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    // Crear constantes no era obligatorio pero sí deseable
    public static int SALIR = 2;
    public static int ESTADO_ACTIVO = 0;
    public static int ESTADO_GANADOR = 1;
    public static int ESTADO_PERDEDOR = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int puntuacionUsuario = 0;

        System.out.println("1. Continuar\n" +
                "2. Salir");
        int opcion = sc.nextInt();
        int estadoJuego = ESTADO_ACTIVO;
        while (opcion!=SALIR && estadoJuego==ESTADO_ACTIVO) {
            int aleatorio = random.nextInt(13) + 1;
            System.out.println("Nuevo valor: " + aleatorio);

            if (aleatorio==1) {
                int queSumar;

                // No era obligatorio poner un bucle
                // Pero sí deseable para controlar que el valor
                // introducido sea correcto
                do {
                    System.out.println("1. Sumar 1\n" +
                            "11. Sumar 11");
                    queSumar = sc.nextInt();
                    if (queSumar!=1 && queSumar!=11) {
                        System.out.println("Valor incorrecto");
                    }
                } while (queSumar!=1 && queSumar!=11);
                puntuacionUsuario += queSumar;
            } else if (aleatorio>=10) {
                puntuacionUsuario += 10;
            } else {
                puntuacionUsuario += aleatorio;
            }

            // Controlamos con estados la condición de salida del bucle
            if (puntuacionUsuario==21) {
                System.out.println("ENHORABUENA");
                estadoJuego = ESTADO_GANADOR;
            } else if (puntuacionUsuario>21) {
                System.out.println("MALA SUERTE");
                estadoJuego = ESTADO_PERDEDOR;
            } else {
                System.out.println("Puntuación actual usuario: " + puntuacionUsuario);
                System.out.println("1. Continuar\n" +
                        "2. Salir");
                opcion = sc.nextInt();
            }

        }
        System.out.println("Puntuación final usuario: " + puntuacionUsuario);
        if (estadoJuego == ESTADO_ACTIVO) {
            if (puntuacionUsuario<16) {
                System.out.println("ERES UN POCO COBARDE");
            } else {
                System.out.println("ADIÓS");
            }
        }
    }
}
