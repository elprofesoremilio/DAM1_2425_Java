package EjerciciosClase.Excepciones.Club;

public class Miembro {
    private static int totalMiembros=0;
    private final int id;
    private String nombre;

    public Miembro(String nombre) {
        this.nombre = nombre;
        this.id = totalMiembros;
        totalMiembros++;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
