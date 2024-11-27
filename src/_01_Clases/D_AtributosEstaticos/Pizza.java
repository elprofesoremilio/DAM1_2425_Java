package _01_Clases.D_AtributosEstaticos;

public class Pizza {
    String nombre;
    String ingrediente1;
    String ingrediente2;
    static int pizzasCreadas=0;

    public Pizza() {
        nombre = "Margarita";
        ingrediente1 = "Tomate";
        ingrediente2 = "Mozzarella";
        pizzasCreadas++;
    }

}
