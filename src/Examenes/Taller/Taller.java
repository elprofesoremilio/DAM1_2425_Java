package Examenes.Taller;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Taller de pintura:
 * atributo capacidadMaxima nos ayuda a impedir que aceptemos más coches de los que caben
 * atributo coches: lista con los coches dentro del taller
 */
public class Taller {
    private final List<Coche> coches;
    private final int capacidadMaxima;

    /**
     *
     * @param capacidadMaxima nº máximo permitido de coches a la vez
     */
    public Taller(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        coches = new LinkedList<>();
    }

    /**
     * Si cabe, mete un coche en el taller.
     * @param coche El coche a pintar cuando se pueda
     * @throws EspacioInsuficienteException se lanza cuando no cabe el coche
     */
    public void aceptar(Coche coche) throws EspacioInsuficienteException{
        if (coches.size() < capacidadMaxima) {
            coches.add(coche);
        } else {
            throw new EspacioInsuficienteException();
        }
    }

    /**
     * Pinta el primer coche de la lista que esté sin pintar, si no encuentra ninguno sin pintar
     * no hace nada
     * @param color el color a pintar
     */
    public void pintar(String color) {
        // Varias formas de hacer lo mismo
        // Si dejamos las tres formas sin comentar se pintan hasta 3 coches
        // FOREACH
/*
        for (Coche coche : coches) {
            if (!coche.isTerminado()) {
                coche.pintar(color);
                // Cuando he encontrado el primero a pintar, se acabó
                break;
            }
        }

        // FORI normal
        for (int i = 0; i < coches.size(); i++) {
            if (!coches.get(i).isTerminado()) {
                coches.get(i).pintar(color);
                break;
            }
        }
*/
        // Busco el índice del primero sin terminar
        int i;
        for (i=0; i<coches.size() && coches.get(i).isTerminado(); i++);
        if (i<coches.size()) {
            coches.get(i).pintar(color);
        }
    }

    /**
     * Saca del taller (lista de coches) el coche cuya matrícula coincide con la dada, siempre
     * que esté terminado.
     * @param matricula del coche a entregar al cliente
     * @throws CocheInexistenteException si el coche no existe
     * @throws CocheSinTerminarException si el coche está sin pintar
     */
    public void entregar(String matricula) throws CocheInexistenteException, CocheSinTerminarException {
        ListIterator<Coche> it = coches.listIterator();
        while (it.hasNext()) {
            Coche coche = it.next();
            if (coche.getMatricula().equals(matricula)) {
                if (!coche.isTerminado()) {
                    // No hay que buscar más, porque lo he encontrado y está sin pintar
                    throw new CocheSinTerminarException();
                } else {
                    it.remove();
                    // Como ya he terminado puedo salir del método
                    return;
                }
            }
        }
        // Si llego hasta aquí es porque no hay coche con esa matrícula
        throw new CocheInexistenteException();
    }

    public Coche get(int i) {
        return coches.get(i);
    }
}
