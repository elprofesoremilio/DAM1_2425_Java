package _03_Clases.G_Enumerados.Francesa;

public enum Numero {
    AS(15, "As"),
    DOS(2, "2");

    private final int numero;
    private final String nombre;

    Numero(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }
}
