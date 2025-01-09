package EjerciciosClase.ClasesYObjetos.HacerCiclo;

public class Estudiante {
    private final boolean bachillerato;
    private final boolean ciclo_medio;

    public Estudiante(boolean bachillerato, boolean ciclo_medio) {
        this.bachillerato = bachillerato;
        this.ciclo_medio = ciclo_medio;
    }

    public boolean puedeMatricularSuperior() {

        if (bachillerato) {
            return true;
        } else if (ciclo_medio) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getBachillerato() {
        return bachillerato;
    }
    public boolean getCicloMedio() {
        return ciclo_medio;
    }
}
