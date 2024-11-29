package EjerciciosClase.CuentaBancaria;

public class MainBanco {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro", 100);

        System.out.println(cuenta.getNombre() + " " + cuenta.getSaldo());
        cuenta.setNombre("Hijo de Pedro");
        if (cuenta.depositar(100)) {
            System.out.println("Operación de depósito realizada.");
        } else {
            System.out.println("Imposible depositar cantidades de 0 o menores.");
        }
        if (cuenta.retirar(100)) {
            System.out.println("Retirada realizada con éxito.");
        } else {
            System.out.println("Imposible realizar retirada");
        }

        System.out.printf("Titular: %s\nSaldo: %f", cuenta.getNombre(), cuenta.getSaldo());

    }
}
