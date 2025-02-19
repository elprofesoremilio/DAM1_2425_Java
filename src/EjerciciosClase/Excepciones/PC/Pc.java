package EjerciciosClase.Excepciones.PC;

public class Pc {
    private Placa placa;

    public Pc(Placa placa) {
        this.placa = placa;
    }

    public void add(RAM ram) throws RAMException {
        placa.add(ram);
    }

    public void remove(RAM ram) {
        placa.remove(ram);
    }

    @Override
    public String toString() {
        return "PC: " + placa;
    }
}
