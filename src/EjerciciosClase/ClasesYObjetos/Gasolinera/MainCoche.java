package EjerciciosClase.ClasesYObjetos.Gasolinera;
public class MainCoche {
    public static void main(String[] args) {
        Coche peugeot = new Coche("7035DBS", 60, 30, false);
        System.out.println(peugeot.isEncendido());
        peugeot.encender();
        System.out.println(peugeot.isEncendido());
        peugeot.apagar();
        System.out.println(peugeot.isEncendido());
        System.out.println(peugeot.getMatricula());
        System.out.println(peugeot.getCombustibleActual());
        System.out.println(peugeot.cargarCombustible(10));
        System.out.println(peugeot.getCombustibleActual());
        System.out.println(peugeot.cargarCombustible(30));
        System.out.println(peugeot.getCombustibleActual());
        System.out.println(peugeot.consumirLitros(30));
        System.out.println(peugeot.getCombustibleActual());
        System.out.println("_-------------_");
        System.out.println(peugeot.llenarDeposito());
        System.out.println(peugeot.getCombustibleActual());

    }
}
