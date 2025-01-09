package EjerciciosClase.ClasesYObjetos.CajeroAutomatico;

import java.util.Scanner;

public class Cajero {
    public static final int FALTA_TARJETA = 1;
    public static final int PIN_INCORRECTO = 2;
    public static final int PIN_OK = 0;

    private Tarjeta tarjeta;
    private final Scanner sc;

    public Cajero() {
        sc = new Scanner(System.in);
        tarjeta = null;
    }

    public void introducirTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int comprobarPin() {
        int resultado = FALTA_TARJETA;
        if (tarjeta!=null) {
            System.out.println("Introduzca el PIN de su tarjeta: ");
            int pin = sc.nextInt();
            /*
            if (tarjeta.comprobarPin(pin)) {
                resultado = PIN_OK;
            } else {
                resultado = PIN_INCORRECTO;
            }
            */
            resultado = (tarjeta.comprobarPin(pin))?PIN_OK:PIN_INCORRECTO;
        }
        return resultado;
    }

    public int elegirOpciones() {
        String opciones = "---- Opciones disponibles ----\n" +
                "1. Ingresar dinero\n" +
                "2. Retirar dinero\n" +
                "3. Mostrar saldo\n" +
                "0. Salir";

        System.out.println(opciones);

        return sc.nextInt();
    }

    public float solicitarCantidad() {
        System.out.println("Introduzca la cantidad deseada: ");
        return sc.nextFloat();
    }

    public int retirar() {
        return tarjeta.retirar(solicitarCantidad());
    }

    public int ingresar() {
        return tarjeta.ingresar(solicitarCantidad());
    }

    public void arrancarCajero(Tarjeta tarjeta) {
        System.out.println("Introduzca tarjeta y pulse ENTER...");
        sc.nextLine();
        this.tarjeta = tarjeta;
        if (comprobarPin() == PIN_OK) {
            int opcion = elegirOpciones();
            while (opcion!=0) {
                switch (opcion) {
                    case 1:
                        System.out.println("Solicitud de ingreso ------ ");
                        // TODO que el usuario vaya indicando cantidades de billetes de 100, 50, 20 o 10
                        switch (ingresar()) {
                            case CuentaBancaria.CANTIDAD_INCORRECTA:
                                System.out.println("Cantidad incorrecta, lo siento");
                                break;
                            case CuentaBancaria.TRANSACCION_OK:
                                System.out.println("El saldo actual es: " + tarjeta.getCuenta().getSaldo());
                                System.out.println("No olvide retirar su tarjeta.");
                                break;
                        }
                        break;
                    case 2:
                        // TODO que el cajero de los billetes de 50, 20 y 10 justos
                        System.out.println("Solicitud de retirada ------ ");
                        switch (retirar()) {
                            case CuentaBancaria.CANTIDAD_INCORRECTA:
                                System.out.println("Cantidad incorrecta, lo siento");
                                break;
                            case CuentaBancaria.SALDO_INSUFICIENTE:
                                System.out.println("Saldo insuficiente, el saldo actual es: " + tarjeta.getCuenta().getSaldo());
                                break;
                            case CuentaBancaria.TRANSACCION_OK:
                                System.out.println("El saldo actual es: " + tarjeta.getCuenta().getSaldo());
                                System.out.println("No olvide retirar su tarjeta y su dinero.");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Saldo actual en tarjeta: " + tarjeta.getCuenta().getSaldo());
                        break;
                    default:
                        System.out.println("Elección incorrecta");
                }
                opcion = elegirOpciones();
            }

        } else {
            System.out.println("Pin incorrecto");
        }
    }
}
