package _03_Clases.F_Interfaces;

public class Empleado implements Imprimible {
    private String nombre;
    private String telefono;

    public Empleado(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toDocument() {

        return String.format("Nombre: %s\nTeléfono: %s",nombre,telefono);
    }
}
