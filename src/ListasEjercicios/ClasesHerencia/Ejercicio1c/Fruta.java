package ListasEjercicios.ClasesHerencia.Ejercicio1c;

public class Fruta {
    private String nombre;
    private String color;

    public Fruta(String nombre, String color) {
        this.color = color;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
