package EjerciciosClase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PersonaFecha {
    private String nombre;
    private LocalDate fechaNacimiento;

    public PersonaFecha(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public PersonaFecha(String nombre, int year, int month, int day) {
        this.nombre = nombre;
        this.fechaNacimiento = LocalDate.of(year,month,day);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        if (fechaNacimiento.isAfter(LocalDate.now())) {
            return;
        } else {
            this.fechaNacimiento = fechaNacimiento;
        }
    }

    public int getEdad() {
        int dia = fechaNacimiento.getDayOfYear();
        int diaActual = LocalDate.now().getDayOfYear();
        if (diaActual<=dia) {
            return LocalDate.now().getYear() - fechaNacimiento.getYear();
        } else {
            return LocalDate.now().getYear() - fechaNacimiento.getYear() -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la fecha en formato dd/MM/yyyy");
        String fechaTexto = sc.next();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(fechaTexto, formato);
        System.out.println("Fecha analizada: " + fecha);
        System.out.println("Introduzca la segunda fecha en formato dd/MM/yyyy");
        LocalDate fecha2 = LocalDate.parse(sc.next(), formato);
        LocalDate fechaActual = LocalDate.now();

        if ((fecha2.isBefore(fechaActual) && fecha.isAfter(fechaActual)) || (fecha.isBefore(fechaActual)&&fecha2.isAfter(fechaActual))) {
            System.out.println("Está dentro");
        } else {
            System.out.println("Está fuera");
        }


    }

}
