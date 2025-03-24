package Examenes.Taller;

public class Coche {
    private final String matricula;
    private String color;
    private boolean terminado;

    public Coche(String matricula, String color) {
        this.matricula = matricula;
        this.color = color;
        this.terminado = false;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getColor() {
        return color;
    }

    public void pintar(String color) {
        this.color = color;
        terminado = true;
    }

    public boolean isTerminado() {
        return terminado;
    }

}
