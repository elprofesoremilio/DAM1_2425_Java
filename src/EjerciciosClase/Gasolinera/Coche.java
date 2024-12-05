package EjerciciosClase.Gasolinera;

/**
 * Clase que gestiona un coche en el ámbito de una gasolinera.
 */
public class Coche {
    private final String matricula;
    private float combustibleActual;
    private final float capacidadDeposito;
    private boolean encendido;

    private Coche(){
        matricula = "";
        capacidadDeposito = 0;
    }

    public Coche(String matricula, float capacidadDeposito, float combustibleActual, boolean encendido) {
        this.matricula = matricula;
        this.capacidadDeposito = capacidadDeposito;
        this.combustibleActual = combustibleActual;
        this.encendido = encendido;
    }
    public Coche(String matricula, float capacidadDeposito) {
        this(matricula,capacidadDeposito,capacidadDeposito,false);
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public boolean isEncendido() {
        return this.encendido;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public float cargarCombustible(float litros) {
        float litrosReales;
        if (litros + combustibleActual <= capacidadDeposito) {
            this.combustibleActual += litros;
            litrosReales = litros;
        } else {
            litrosReales = llenarDeposito();
        }
        return litrosReales;
    }

    /**
     * Asigna a los litros acutales la capacidad total del depósito.
     * @return float -> litros reales añadidos al depósito hasta llenarlo.
     */
    public float llenarDeposito() {
        float litrosReales = capacidadDeposito - combustibleActual;
        this.combustibleActual = capacidadDeposito;
        return litrosReales;
    }

    /**
     * Resta a los litros actuales los que se trada de consumir, siempre
     * y cuando sean suficientes. Si no son suficientes, se actualiza la capacidad
     * del depósito a 0.
     * @param litros Cantidad de litros a restar
     * @return float -> Litros finalmente restados a la capacidad actual
     */
    public float consumirLitros(float litros) {
        float litrosReales;
        if (combustibleActual - litros >= 0) {
            this.combustibleActual -= litros;
            litrosReales = litros;
        } else {
            litrosReales = combustibleActual;
            combustibleActual = 0;
        }
        return litrosReales;
    }

    public float getCombustibleActual() {
        return this.combustibleActual;
    }

    public float getCapacidadDeposito() {
        return this.capacidadDeposito;
    }
}
