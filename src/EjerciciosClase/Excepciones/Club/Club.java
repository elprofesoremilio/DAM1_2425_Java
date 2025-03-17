package EjerciciosClase.Excepciones.Club;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Club {
    List<Miembro> miembros;

    public Club() {
        this.miembros = new LinkedList<>();
    }

    public void add(Miembro miembro) {
        this.miembros.add(miembro);
    }

    public void remove(int id) throws MiembroNoEncontradoException {
        ListIterator<Miembro> it = miembros.listIterator();
        boolean encontrado = false;
        while (it.hasNext()) {
            Miembro miembro = it.next();
            if (miembro.getId()==id) {
                it.remove();
                encontrado = true;
            }
        }
        if (!encontrado) {
            throw new MiembroNoEncontradoException();
        }
    }
}
