package Examenes.Agenda;

import java.util.LinkedList;
import java.util.List;

public class Grupo {
    private String nombre;
    List<Contacto> contactos;

    public Grupo(String nombre) {
        this.nombre = nombre;
        contactos = new LinkedList<>();
    }

    public void agregarContacto(Contacto c) {
        contactos.add(c);
    }

    public void eliminarContacto(Contacto c) {
        contactos.remove(c);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- Grupo: ").append(nombre).append(" ----");
        for (Contacto c : contactos) {
            result.append("\n").append(c);
        }
        return result.toString();
    }

    public String getNombre() {
        return nombre;
    }
}
