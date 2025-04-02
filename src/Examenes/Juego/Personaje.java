package Examenes.Juego;

public class Personaje {
    private String nombre;
    private int nivel;
    private Clase clase;
    private int puntosVida, puntosAtaque;
    private final int idPersonaje;
    private static int contador=0;

    public Personaje(String nombre, int nivel, Clase clase, int puntosVida, int puntosAtaque)  {
        this.nombre = nombre;
        this.nivel = nivel;
        this.clase = clase;
        this.puntosVida = puntosVida;
        this.puntosAtaque = puntosAtaque;
        this.idPersonaje = contador;
        contador++;
    }

    public int getIdPersonaje() {
        return idPersonaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel)  {
        this.nivel = nivel;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida)  {
        this.puntosVida = puntosVida;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque)  {
        this.puntosAtaque = puntosAtaque;
    }

    public String mostrarEstadisticas() {
        return String.format(
                "Id: %d\nNombre: %s\nClase: %s\nVida: %d\nAtaque: %d",
                idPersonaje, nombre, clase, puntosVida, puntosAtaque
        );
    }

    public int atacar() {
        return puntosAtaque*nivel/2;
    }
}
