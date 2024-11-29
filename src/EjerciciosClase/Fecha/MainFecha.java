package EjerciciosClase.Fecha;

import java.util.Random;

public class MainFecha {
    public static void main(String[] args) {
        Random random = new Random();
        Fecha fecha = new Fecha(
                random.nextInt(2)+30,
                random.nextInt(12)+1,
                random.nextInt(3000)
        );
        System.out.println(fecha.formatear());
        System.out.println(fecha.esValida());

        fecha.setMonth(2);

        // Públicos
        // sout(fecha.day)
        // fecha.day = 2

        // Privados
        // sout(fecha.getDay())
        // fecha.setDay(2) -->   this.day = day


        System.out.println(fecha.formatear());
        System.out.println(fecha.esValida());
    }
}
