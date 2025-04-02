package EjerciciosClase.Swing.GestionAlumnos;

public class Alumno {
    private String nombre, correo;
    byte edad;

    public Alumno(String nombre, String correo, byte edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
