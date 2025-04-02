package Examenes.Juego;

public class Main {
    public static void main(String[] args) {
        Personaje mago, guerrero, arquero, churro;
        mago = new Personaje("Maguete",36, Clase.Mago, 25,100);
        guerrero = new Personaje("Burrete",25, Clase.Guerrero, 100,60);
        arquero = new Personaje("Dardo",30, Clase.Arquero, 50,45);
        churro = new Personaje("Churro",-1, Clase.Arquero, 50,45);

        Equipo equipo = new Equipo("Paquetes");
        try {
            equipo.agregarPersonaje(mago);
            equipo.agregarPersonaje(guerrero);
            equipo.agregarPersonaje(arquero);
        } catch (PersonajeInvalidoException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(equipo.listarPersonajes());

        Personaje personaje = equipo.buscarPersonaje("Antonio");
        System.out.println(personaje);
        personaje = equipo.buscarPersonaje("Dardo");
        System.out.println(personaje.mostrarEstadisticas());

        try {
            equipo.agregarPersonaje(churro);
        } catch (PersonajeInvalidoException e) {
            System.err.println(e.getMessage());
        }
        churro.setNivel(80);
        churro.setPuntosVida(-50);
        try {
            equipo.agregarPersonaje(churro);
        } catch (PersonajeInvalidoException e) {
            System.err.println(e.getMessage());
        }
        churro.setPuntosVida(50);
        churro.setPuntosAtaque(-50);
        try {
            equipo.agregarPersonaje(churro);
        } catch (PersonajeInvalidoException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(equipo.poderAtaqueTotal());
        equipo.eliminarPersonajesClase(Clase.Mago);

        System.out.println(equipo.listarPersonajes());
        System.out.println(equipo.poderAtaqueTotal());

    }
}
