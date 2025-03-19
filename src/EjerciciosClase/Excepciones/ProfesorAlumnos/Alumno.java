package EjerciciosClase.Excepciones.ProfesorAlumnos;

public class Alumno {
    private int numeroMatricula;
    private String apellidos;
    private String nombre;

    public Alumno(int numeroMatricula, String apellidos, String nombre) {
        this.numeroMatricula = numeroMatricula;
        this.apellidos = apellidos;
        this.nombre = nombre;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (o==null) return false;
        if (o==this) return true;
        if (o.getClass() != getClass()) return false;
        Alumno alumno = (Alumno) o;
        return alumno.apellidos.equals(apellidos) && alumno.nombre.equals(nombre);
    }
}
