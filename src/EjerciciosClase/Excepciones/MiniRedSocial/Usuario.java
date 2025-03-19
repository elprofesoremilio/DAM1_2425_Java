package EjerciciosClase.Excepciones.MiniRedSocial;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Usuario {
    private final int id;
    private String nombre;
    private static int users=0;
    private List<Usuario> amigos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.id = users++;
        amigos = new LinkedList<>();
    }

    public void add(Usuario amigo) {
        amigos.add(amigo);
    }

    public Usuario remove(int id) throws AmigoNoEncontradoException {
        ListIterator<Usuario> it = amigos.listIterator();

        while (it.hasNext()) {
            Usuario amigo = it.next();
            if (id==amigo.getId()) {
                it.remove();
                return amigo;
            }
        }
        throw new AmigoNoEncontradoException();
    }

    public Usuario remove(String nombre) throws AmigoNoEncontradoException, NombreDuplicadoException {
        Usuario borrar=null;

        for (Usuario amigo : amigos) {
            if (amigo.getNombre().equals(nombre)) {
                if (borrar==null) {
                    borrar = amigo;
                } else {
                    throw new NombreDuplicadoException();
                }
            }
        }

        if (borrar==null) {
            throw new AmigoNoEncontradoException();
        } else {
            amigos.remove(borrar);
            return borrar;
        }

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
