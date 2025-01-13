package ListasEjercicios.ClasesHerencia.Ejercicio1c;


public class Main {
    public static void main(String[] args) {
        Manzana manzana = new Manzana("Manzana", "rojo", "Royal gala");
        manzana.mostrarInfo();
        System.out.println(manzana);
        System.out.println(manzana.getClass());
        Manzana pepita = new Manzana("Manzana", "rojo", "Royal gala");
        System.out.println(pepita.equals(manzana));
    }
}
