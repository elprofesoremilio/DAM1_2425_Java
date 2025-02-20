package Examenes.Agenda;

import java.util.LinkedList;
import java.util.List;

public class Agenda {
    private List<Grupo> grupos;

    public Agenda() {
        grupos = new LinkedList<>();
    }

    public void crearGrupo(String nombre) {
        grupos.add(new Grupo(nombre));
    }

    public Grupo getGrupo(String nombre) {
        for (Grupo grupo : grupos) {
            if (grupo.getNombre().equals(nombre)) {
                return grupo;
            }
        }
        return null;
    }

    public Contacto buscarContacto(String email) {
        for (Grupo grupo : grupos) {
            for (Contacto contacto : grupo.contactos) {
                if (contacto.email.equals(email)) {
                    return contacto;
                }
            }
        }
        return null;
    }

    public void eliminarGrupo(String nombre) {
        Grupo buscado = null;
        for (Grupo grupo : grupos) {
            if (grupo.getNombre().equals(nombre)) {
                buscado = grupo;
            }
        }
        grupos.remove(buscado);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("-- Agenda --");
        for (Grupo grupo : grupos) {
            result.append("\n").append(grupo);
        }

        return result.toString();
    }
}
