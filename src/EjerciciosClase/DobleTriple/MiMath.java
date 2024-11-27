package EjerciciosClase.DobleTriple;

public class MiMath {
    private int numero;

    public MiMath(int nuevoNumero) {
        numero = nuevoNumero;
    }

    public void setNumero(int nuevoNumero) {
        numero = nuevoNumero;
    }

    public int getNumero() {
        return numero;
    }

    public int doble() {
        return numero*2;
    }

    public int triple() {
        return numero*3;
    }
}
