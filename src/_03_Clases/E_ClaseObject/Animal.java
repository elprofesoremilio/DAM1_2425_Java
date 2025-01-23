package _03_Clases.E_ClaseObject;

public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format(
            "-------------\nNombre: %s\nEdad: %d",
            nombre, edad
        );
    }

    @Override
    public boolean equals(Object obj) {
        // Primero vemos si es la misma dirección
        if (obj == this) return true;
        // Después si el objeto a comparar es nulo
        if (obj == null) return false;
        // Después si no son de la misma clase
        if (obj.getClass() != this.getClass())  return false;
        // Tras pasar todos esos filtros sé que es un Animal --> casting
        Animal other = (Animal)obj;
        // Comparo aquellos atributos que considere esenciales
        if (!this.nombre.equals(other.nombre)) return false;
        if (this.edad!=other.edad) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return nombre.hashCode() + Integer.hashCode(edad);
    }
}
