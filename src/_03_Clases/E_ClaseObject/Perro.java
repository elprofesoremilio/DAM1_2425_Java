package _03_Clases.E_ClaseObject;

public class Perro {
    private String nombre;
    private int edad;

    public Perro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\nEdad: %d",nombre, edad);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Perro p = (Perro)obj;
        return (p.nombre.equals(this.nombre) && edad == p.edad);
    }
}
