import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Test {
    public static void main(String[] args) {
        // Fecha actual
        LocalDate hoy = LocalDate.now();
        System.out.println("Fecha actual: " + hoy);

        // Crear una fecha específica
        LocalDate nacimiento = LocalDate.of(2005, 2, 12);
        System.out.println("Fecha de nacimiento: " + nacimiento);

        // Sumar días a una fecha
        LocalDate mañana = hoy.plusDays(1);
        System.out.println("Mañana será: " + mañana);

        // Comparar fechas
        if (hoy.isBefore(mañana)) {
            System.out.println("Hoy es antes del " + mañana);
        }

        // Crear una fecha a partir de una cadena de texto (String)
        LocalDate otraFecha = LocalDate.parse("2024-01-15");
        System.out.println("Otra fecha: " + otraFecha);
    }
}