package ListasEjercicios.ClasesHerencia.Ejercicio1c;

public class Manzana extends Fruta {
    private String variedad;

    public Manzana(String nombre, String color, String variedad) {
        super(nombre, color);
        this.variedad = variedad;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }


    public void mostrarInfo() {
        System.out.println(this.getNombre() + "("+ super.getColor() + "," + this.variedad+")");
    }
}
