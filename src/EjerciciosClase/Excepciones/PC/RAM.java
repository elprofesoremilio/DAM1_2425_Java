package EjerciciosClase.Excepciones.PC;

public class RAM {
    private int capacidad;
    private int mhz;

    public RAM(int capacidad, int mhz) {
        this.capacidad = capacidad;
        this.mhz = mhz;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getMhz() {
        return mhz;
    }

    public void setMhz(int mhz) {
        this.mhz = mhz;
    }

    @Override
    public String toString() {
        return String.format("RAM: capacidad=%d, velocidad=%d", capacidad, mhz);
    }
}
