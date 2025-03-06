package EjerciciosClase.Buscaminas.Modelo;

public class Celda {
    private boolean mina;
    private byte minasAlrededor;
    private boolean destapada;

    public Celda() {
        mina = false;
        minasAlrededor = 0;
        destapada = false;
    }

    public boolean destapar() {
        destapada = true;
        return mina;
    }

    public void setMinasAlrededor(byte minasAlrededor) {
        this.minasAlrededor = minasAlrededor;
    }

    public byte getMinasAlrededor() {
        return minasAlrededor;
    }

    public boolean isMina() {
        return mina;
    }

    public void colocarMina() {
        mina = true;
    }

    public boolean isDestapada() {
        return destapada;
    }
}
