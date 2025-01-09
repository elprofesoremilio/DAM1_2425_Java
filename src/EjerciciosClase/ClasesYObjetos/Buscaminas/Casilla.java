package EjerciciosClase.ClasesYObjetos.Buscaminas;

public class Casilla {
    private boolean mina;
    private boolean bandera;
    private boolean destapada;
    private int minasAlrededor;

    public Casilla() {
        mina = false;
        bandera = false;
        destapada = false;
        minasAlrededor = -1;
    }

    public int destapar() {
        destapada = true;
        if (mina) {
            return -1;
        } else {
            return minasAlrededor;
        }
    }

    public void marcar() {
        bandera = true;
    }
}
