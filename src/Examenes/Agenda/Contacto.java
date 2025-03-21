package Examenes.Agenda;

public class Contacto {
    private String nombre;
    private String telefono;
    String email;

    public String toCSV() {
        return nombre+","+telefono+","+email;
    }

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("\t ---- Contacto ----\n\t\tNombre: %s\n\t\tTelefono: %s\n\t\temail: %s",
                nombre, telefono, email);
    }

    @Override
    public boolean equals(Object o) {
        if (o==this) {
            return true;
        }
        if (o==null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Contacto c = ((Contacto) o);
        if (!email.equals(c.email)) {
            return false;
        }

        return true;
    }
}
