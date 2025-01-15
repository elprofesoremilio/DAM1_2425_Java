package ListasEjercicios.ClasesHerencia.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Empleado e = new Empleado("Ignacio", 1000f);
        Gerente g = new Gerente("Alfonso", 5000f, "Sostenibilidad en el cargo");
        System.out.print(e);
        System.out.println("-------------");
        System.out.println(g);

    }
}
