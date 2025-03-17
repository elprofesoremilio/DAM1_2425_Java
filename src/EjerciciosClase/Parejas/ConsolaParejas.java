package EjerciciosClase.Parejas;

import java.util.Scanner;

public class ConsolaParejas {
    private Scanner entrada;
    private JuegoParejas juego;
    private int dificultad;

    public ConsolaParejas() {
        entrada = new Scanner(System.in);
        elegirDificultad();
        crearMesa();
        jugar();
    }

    private void jugar() {
        do {
            voltear();
            comprobar();
        } while (!finDeJuego());
    }

    private boolean finDeJuego() {
        boolean result = false;
        // TODO consola.finJuego
        return result;
    }

    private void comprobar() {
        // TODO consola.comprobar
    }

    private void voltear() {
        // TODO consola.voltear
    }

    private void crearMesa() {

        if (dificultad==0) {
            System.out.println("Ha elegido salir");
            System.exit(0);
        }
        juego = new JuegoParejas(dificultad);
    }

    private void elegirDificultad() {
        System.out.println("Elija la dificultad: \n1. Fácil\n2. Intermedio\n3. Difícil\n0. Salir");
        dificultad = entrada.nextInt();
    }


}
