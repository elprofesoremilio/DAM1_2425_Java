package _03_Clases.A_EstructuraBasica.Restaurante;

import javax.swing.*;

public class Cliente {
    String nombre;
    int mesa;

    Cliente(String nombre, int mesa) {
        this.nombre = nombre;
        this.mesa = mesa;
    }

    Cliente() {
        this("Desconocido",1);
    }

    Cliente(String nombre) {
        this(nombre,1);
    }

    void presentarse() {
        System.out.println("Hola, soy " + nombre + " y estoy en la mesa " + mesa + ".");
    }
}
