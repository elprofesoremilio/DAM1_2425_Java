package EjerciciosClase.CajeroAutomatico;

public class CuentaBancaria {
    public static final int SALDO_INSUFICIENTE = -1;
    public static final int CANTIDAD_INCORRECTA = 1;
    public static final int TRANSACCION_OK = 0;

    private String titular;
    private float saldo;

    public CuentaBancaria(String titular, float saldo) {
        this.titular = titular;
        this.ingresar(saldo);
    }

    public int ingresar(float cantidad) {
        int mensaje = TRANSACCION_OK;
        if (cantidad>0) {
            saldo += cantidad;
        } else {
            mensaje = CANTIDAD_INCORRECTA;
        }
        return mensaje;
    }

    public int retirar(float cantidad) {
        int mensaje = TRANSACCION_OK;
        if (cantidad<=saldo) {
            if (cantidad>0) {
                saldo -= cantidad;
            } else {
                mensaje = CANTIDAD_INCORRECTA;
            }
        } else {
            mensaje = SALDO_INSUFICIENTE;
        }
        return mensaje;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
