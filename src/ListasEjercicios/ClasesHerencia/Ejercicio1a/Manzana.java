package ListasEjercicios.ClasesHerencia.Ejercicio1a;

public class Manzana extends Fruta {
    private String variedad;

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public void mostrarInfo() {
        System.out.println(this.getNombre() + "("+ this.getColor() + "," + this.variedad+")");
    }
}
