package ListasEjercicios.ClasesHerencia.Ejercicio1b;

public class Manzana extends Fruta {
    protected String variedad;

    public void mostrarInfo() {
        System.out.printf("%s (%s, %s)\n", nombre, color, variedad);
    }
}
