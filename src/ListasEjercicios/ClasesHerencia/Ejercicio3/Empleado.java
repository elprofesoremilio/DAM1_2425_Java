package ListasEjercicios.ClasesHerencia.Ejercicio3;

public class Empleado {
    protected String nombre;
    protected float salario;

    public Empleado(String nombre, float salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("Nombre del empleado: %s\n" +
                        "Salario: %.2f\n",
                nombre, salario
        );
    }
}
