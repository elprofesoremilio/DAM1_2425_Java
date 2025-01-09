package EjerciciosClase.ClasesYObjetos.CuentaBancaria;

public class CuentaBancaria {
    private String nombre;
    private double saldo;

    public CuentaBancaria(String nombre, double saldo) {
        this.nombre = nombre;
        if (saldo>0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
            // Aquí habría que lanzar una excepción
            // ExcepcionSaldoInvalido
        }
    }

    public boolean depositar(double cantidad) {
        if (cantidad>0) {
            saldo += cantidad;
            return true;
        } else {
            return false;
        }
    }

    // TODO Ponemos boolean pero lo suyo es posibilitar devolver más valores
    public boolean retirar(double cantidad) {
        if (cantidad>0 && cantidad<=saldo) {
            saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular de la cuenta: " + nombre);
        System.out.println("Saldo actual = " + saldo);
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
