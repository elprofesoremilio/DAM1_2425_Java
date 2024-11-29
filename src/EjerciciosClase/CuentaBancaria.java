package EjerciciosClase;

public class CuentaBancaria {
    private String nombre;
    private double saldo;

    public CuentaBancaria(String nombre, double saldo) {
        this.nombre = nombre;
        if (saldo>0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
            System.out.println("Saldo negativo incorrecto, actualizado a 0");
        }
    }

    public void depositar(double cantidad) {
        if (cantidad>0) {
            saldo += cantidad;
            System.out.println("Operación de depósito realizada. Saldo actual: " + saldo);
        } else {
            System.out.println("Imposible depositar cantidades de 0 o menores.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad>0) {
            if (cantidad<=saldo) {
                saldo -= cantidad;
                System.out.println("Operación de retirada realizada. Saldo actual: " + saldo);
            } else {
                System.out.println("Imposible retirar: saldo insuficiente");
            }
        } else {
            System.out.println("No se puede retirar una cantidad negativa.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular de la cuenta: " + nombre);
        System.out.println("Saldo actual = " + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro", 100);
        System.out.println(cuenta.nombre + " " + cuenta.saldo);
        cuenta.depositar(100);
        System.out.println(cuenta.saldo);
        cuenta.depositar(0);
        System.out.println(cuenta.saldo);
        cuenta.depositar(-100);
        System.out.println(cuenta.saldo);
        cuenta.retirar(100);
        System.out.println(cuenta.saldo);
        cuenta.retirar(-10);
        System.out.println(cuenta.saldo);
        cuenta.retirar(200);
        System.out.println(cuenta.saldo);
        cuenta.mostrarSaldo();
    }


}
