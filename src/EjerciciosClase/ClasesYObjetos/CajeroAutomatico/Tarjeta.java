package EjerciciosClase.ClasesYObjetos.CajeroAutomatico;

public class Tarjeta {
    private final CuentaBancaria cuenta;
    private final int pin;

    public Tarjeta(CuentaBancaria cuenta, int pin) {
        this.cuenta = cuenta;
        this.pin = pin;
    }

    public int retirar(float cantidad) {
        return cuenta.retirar(cantidad);
    }

    public int ingresar(float cantidad) {
        return cuenta.ingresar(cantidad);
    }

    public boolean comprobarPin(int pin) {
        return this.pin == pin;
    }

    public CuentaBancaria getCuenta() {
        return this.cuenta;
    }
}
