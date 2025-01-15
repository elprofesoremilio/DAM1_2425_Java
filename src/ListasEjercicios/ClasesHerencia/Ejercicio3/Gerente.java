package ListasEjercicios.ClasesHerencia.Ejercicio3;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, float salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString().replace("empleado", "gerente") + String.format("Departamento: %s", departamento);
    }

}
