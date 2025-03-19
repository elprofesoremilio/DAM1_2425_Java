package EjerciciosClase.Excepciones.ProfesorAlumnos;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Profesor {
    List<Alumno> alumnos;

    public Profesor() {
        alumnos = new LinkedList<>();
    }

    public void add(int numeroMatricula, String apellidos, String nombre) throws MatriculaDuplicadaException {
        for (Alumno alumno : alumnos) {
            if (alumno.getNumeroMatricula()==numeroMatricula) {
                throw new MatriculaDuplicadaException();
            }
        }
        alumnos.add(new Alumno(numeroMatricula,apellidos,nombre));
    }

    public void update(Alumno alumno, String apellidos, String nombre) throws AlumnoInexistenteException {
        boolean encontrado = false;

        for (Alumno alumnoACambiar : alumnos) {
            if (alumnoACambiar.equals(alumno)) {
                alumnoACambiar.setApellidos(apellidos);
                alumnoACambiar.setNombre(nombre);
                encontrado = true;
            }
        }
        if (!encontrado) throw new AlumnoInexistenteException();
    }

    public void remove(String apellidos, String nombre) throws AlumnoInexistenteException {
        ListIterator<Alumno> iterator = alumnos.listIterator();
        boolean borrado = false;

        while (iterator.hasNext()) {
            Alumno alumno = iterator.next();
            if (alumno.getNombre().equals(nombre) && alumno.getApellidos().equals(apellidos)) {
                iterator.remove();
                borrado = true;
            }
        }

        if (!borrado) {
            throw new AlumnoInexistenteException();
        }
    }
}
