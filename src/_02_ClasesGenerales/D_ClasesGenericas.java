package _02_ClasesGenerales;

import java.util.ArrayList;

public class D_ClasesGenericas<K,V> {
    private K clave;
    private V valor;

    public D_ClasesGenericas(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Clave: " + clave + "\nValor: " + valor;
    }

    public static void main(String[] args) {
        D_ClasesGenericas<String, String> dato = new D_ClasesGenericas<>("color", "rojo");
        System.out.println(dato);
    }
}
