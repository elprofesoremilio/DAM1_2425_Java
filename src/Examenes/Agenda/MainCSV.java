package Examenes.Agenda;

public class MainCSV {
    public static void main(String[] args) {
        Grupo grupo = new Grupo("Contactos");

        grupo.cargarCSV();
        System.out.println(grupo);
    }
}
