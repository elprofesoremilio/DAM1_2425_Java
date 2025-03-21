package EjerciciosClase.Parejas;

import java.time.Instant;

public class Registro {
    private String jugador;
    private Instant registro;
    private int dificultad;
    private int movimientos;

    public Registro(String jugador, int dificultad, int movimientos) {
        this.jugador = jugador;
        this.dificultad = dificultad;
        this.movimientos = movimientos;
        registro = Instant.now();
    }

    public Registro(String jugador, Instant registro, int dificultad, int movimientos) {
        this.jugador = jugador;
        this.dificultad = dificultad;
        this.movimientos = movimientos;
        this.registro = registro;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public Instant getRegistro() {
        return registro;
    }

    public void setRegistro(Instant registro) {
        this.registro = registro;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }

    public String toCSV() {
        return jugador+","+registro.toString()+","+dificultad+","+movimientos;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "jugador='" + jugador + '\'' +
                ", registro=" + registro +
                ", dificultad=" + dificultad +
                ", movimientos=" + movimientos +
                '}';
    }
}
