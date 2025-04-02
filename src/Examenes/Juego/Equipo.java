package Examenes.Juego;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Equipo {
    private String nombre;
    private List<Personaje> personajes;

    public Equipo(String nombre) {
        this.nombre = nombre;
        personajes = new LinkedList<>();
    }

    public String listarPersonajes() {
        StringBuilder result = new StringBuilder("Equipo: " + nombre + "\n---------------------");
        for (Personaje personaje : personajes) {
            result.append("\n.......................\n")
                    .append(personaje.mostrarEstadisticas());
        }
        return result.toString();
    }

    public void agregarPersonaje(Personaje personaje) throws PersonajeInvalidoException {
        if (personaje.getNivel()<1 || personaje.getNivel()>100) {
            throw new PersonajeInvalidoException("Nivel inválido");
        } else if (personaje.getPuntosVida()<0) {
            throw new PersonajeInvalidoException("Puntos de vida inválidos");
        } else if (personaje.getPuntosAtaque()<0) {
            throw new PersonajeInvalidoException("Puntos de ataque inválidos");
        }
        personajes.add(personaje);
    }

    public Personaje buscarPersonaje(String nombre) {
        for (Personaje personaje : personajes) {
            if (personaje.getNombre().equals(nombre)) {
                return personaje;
            }
        }
        return null;
    }

    public int poderAtaqueTotal() {
        int result=0;
        for (Personaje personaje : personajes) {
            result+=personaje.atacar();
        }
        return result;
    }

    public void eliminarPersonajesClase(Clase clase) {
        ListIterator<Personaje> it = personajes.listIterator();
        while (it.hasNext()) {
            Personaje personaje = it.next();
            if (personaje.getClase()==clase) {
                it.remove();
            }
        }
    }


}
