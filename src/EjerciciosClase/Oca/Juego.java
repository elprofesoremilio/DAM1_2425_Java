package EjerciciosClase.Oca;

import com.sun.xml.internal.bind.v2.TODO;

public class Juego {
    private Tablero tablero;

    public Juego(int jugadores) {
        tablero = new Tablero(jugadores);
    }

    public void jugarTurno() {
        // TODO jugarTurno
    }

    public boolean terminado() {
        // TODO terminado
        boolean result=false;
        return result;
    }

    public String colorActivo() {
        // TODO colorActivo
        return "";
    }

    public byte posicionActiva() {
        // TODO posicionActiva
        return 0;
    }

    public String casillaActiva() {
        // TODO casillaActiva
        return "";
    }

    public byte turnosParaJugar() {
        // TODO casillaActiva
        return 0;
    }
}
