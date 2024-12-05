package EjerciciosClase.Gasolinera;

import java.util.Scanner;

public class Pantalla {
    private Surtidor surtidor;
    Scanner sc = new Scanner(System.in);

    public Pantalla() {
        surtidor = new Surtidor(1000, 1.5f);
    }

    private void mostrarImporte() {
        System.out.println("Litros surtidos: " + surtidor.getLitrosSurtidos());
        System.out.println("Precio a pagar: ");
        System.out.println(surtidor.calcularImporte());

    }

    public void atenderCoche(Coche coche) {
        String opciones = "----- OPCIONES -----\n" +
                "1. Llenar depósito\n" +
                "2. Indicar litros\n" +
                "3. Indicar importe" +
                "0. Salir";

        System.out.println(opciones);
        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1:
                surtidor.llenarDeposito(coche);
                mostrarImporte();
                break;
            case 2:
                System.out.println("Introduzca litros a surtir: ");
                float litros = sc.nextFloat();
                surtidor.surtirLitros(litros, coche);
                mostrarImporte();
                break;
            case 3:
                System.out.println("Introduzca el importe: ");
                float importe = sc.nextFloat();
                surtidor.surtirPorPrecio(importe, coche);
                mostrarImporte();
                break;
            default:
                System.out.println("Buenas tardes.");
        }

    }

}
