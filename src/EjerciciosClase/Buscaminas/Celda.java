package EjerciciosClase.Buscaminas;

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

    @Override
    public String toString() {
        if (!destapada) {
            return Character.toString('\u2395');
        } else {
            if (mina) {
                return "*";
            } else {
                return Byte.toString(minasAlrededor);
            }
        }
    }

    public static void main(String[] args) {
        Celda celda = new Celda();
        celda.colocarMina();
        System.out.println(celda);
        celda.destapar();
        System.out.println(celda.destapada);
    }

    public boolean isDestapada() {
        return destapada;
    }
}
