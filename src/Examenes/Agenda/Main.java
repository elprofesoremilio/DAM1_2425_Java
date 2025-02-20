package Examenes.Agenda;

public class Main {
    public static void main(String[] args) {
        Contacto jacinto = new Contacto("Jacinto", "+34600123456", "jacinto@iescy.com");
        Contacto anselmo = new Contacto("Anselmo", "+34698765432", "anselmo@iescy.com");
        Contacto jacintoFalso = new Contacto("Jacintillo", "+34693455432", "jacintoFalso@iescy.com");
        Contacto anselmoFalso = new Contacto("Anselmillo", "+34698763333", "anselmoFalso@iescy.com");

        Agenda agenda = new Agenda();
        agenda.crearGrupo("Familia");

        Grupo grupoFamilia = agenda.getGrupo("Familia");
        grupoFamilia.agregarContacto(jacinto);
        grupoFamilia.agregarContacto(jacintoFalso);
        grupoFamilia.agregarContacto(anselmo);
        grupoFamilia.eliminarContacto(jacintoFalso);

        agenda.crearGrupo("Falsos");

        Grupo grupoFalsos = agenda.getGrupo("Falsos");
        grupoFalsos.agregarContacto(jacintoFalso);
        grupoFalsos.agregarContacto(anselmoFalso);

        System.out.println(agenda);

        Contacto c = agenda.buscarContacto("jacintoFalso@iescy.com");
        System.out.println(c);

        agenda.eliminarGrupo("Falsos");

        System.out.println(agenda);
    }
}
