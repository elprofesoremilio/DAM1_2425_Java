package EjerciciosClase.Excepciones.PC;

import java.util.ArrayList;
import java.util.List;

public class Placa {
    private List<RAM> modulos;
    private int maxModulos;
    private int maxCapacidad;
    private int maxMhz;
    private int capacidadInstalada;

    /**
     *
     * @param maxModulos
     * @param maxCapacidad
     * @param maxMhz
     */
    public Placa(int maxModulos, int maxCapacidad, int maxMhz) {
        this.maxModulos = maxModulos;
        this.maxCapacidad = maxCapacidad;
        this.maxMhz = maxMhz;
        modulos = new ArrayList<>();
        capacidadInstalada = 0;
    }

    public void add(RAM ram) throws VelocidadIncompatibleException, ModulosSuperadosException, CapacidadRamException {
        if (ram.getCapacidad()+ capacidadInstalada <= maxCapacidad) {
            if (maxModulos > modulos.size()) {
                if (ram.getMhz() <= maxMhz) {
                    // Puedo instalarla
                    modulos.add(ram);
                    capacidadInstalada += ram.getCapacidad();
                } else {
                    // Excepción de velocidad incompatible
                    throw new VelocidadIncompatibleException();
                }
            } else {
                //  Excepción de módulos superados
                throw new ModulosSuperadosException();
            }
        } else {
            // Excepción de capacidad superada
            throw new CapacidadRamException();
        }
    }

    public void remove(RAM ram) {
        modulos.remove(ram);
        capacidadInstalada -= ram.getCapacidad();
    }

    public RAM getRam(int index) {
        return modulos.get(index);
    }

    public int getMaxModulos() {
        return maxModulos;
    }

    public void setMaxModulos(int maxModulos) {
        this.maxModulos = maxModulos;
    }

    public int getMaxCapacidad() {
        return maxCapacidad;
    }

    public void setMaxCapacidad(int maxCapacidad) {
        this.maxCapacidad = maxCapacidad;
    }

    public int getMaxMhz() {
        return maxMhz;
    }

    public void setMaxMhz(int maxMhz) {
        this.maxMhz = maxMhz;
    }

    @Override
    public String toString() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Placa base:\n");
        for (RAM ram : modulos) {
            mensaje.append("    ").append(ram).append("\n");
        }
        return mensaje.toString();
    }
}
