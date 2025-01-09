package EjerciciosClase.ClasesYObjetos.CajeroAutomatico;

public class MainCajero {
    public static void main(String[] args) {
        Cajero cajero = new Cajero();
        CuentaBancaria cuenta = new CuentaBancaria("Cuenta DAM", 50f);
        Tarjeta tarjeta = new Tarjeta(cuenta, 1234);
        cajero.arrancarCajero(tarjeta);
    }
}
