package EjerciciosClase.Excepciones.MiniRedSocial;

import java.util.LinkedList;
import java.util.List;

public class RedSocial {
    List<Usuario> usuarios;

    public RedSocial() {
        usuarios = new LinkedList<>();
    }

    public void add(Usuario usuario) {
        usuarios.add(usuario);
    }

    public boolean remove(Usuario usuario) {
        return usuarios.remove(usuario);
    }

    public Usuario remove(Usuario usuario, String nombreAmigo) throws AmigoNoEncontradoException, NombreDuplicadoException {
        return usuario.remove(nombreAmigo);
    }

    public Usuario remove(Usuario usuario, int id) throws AmigoNoEncontradoException {
        return usuario.remove(id);
    }
}
