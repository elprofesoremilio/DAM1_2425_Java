package ListasEjercicios.SobrescribirObject;

import EjerciciosClase.ClasesYObjetos.Producto.Producto;

public class Ejercicio3_Producto {
    private String nombre;
    private float precio;

    public Ejercicio3_Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format(
            "Nombre: %s\nPrecio: %.2f",
            this.nombre, this.precio
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this) return true;
        if (obj==null || obj.getClass() != this.getClass()) return false;
        Ejercicio3_Producto producto = (Ejercicio3_Producto) obj;
        if (!this.nombre.equals(producto.nombre)) return false;
        if (this.precio != producto.precio) return false;

        return true;
    }

    public static void main(String[] args) {
        Ejercicio3_Producto papas = new Ejercicio3_Producto("Papas", 1.5f);
        Ejercicio3_Producto leche = new Ejercicio3_Producto("Leche", 1.3f);

        System.out.println(papas.equals(leche));

    }
}
