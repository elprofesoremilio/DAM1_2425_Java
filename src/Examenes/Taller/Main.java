package Examenes.Taller;

public class Main {
    public static void main(String[] args) {
        Taller taller = new Taller(3);
        try {
            taller.aceptar(new Coche("1","a"));
            System.out.println("Coche aceptado");
            taller.aceptar(new Coche("2","a"));
            System.out.println("Coche aceptado");
            taller.aceptar(new Coche("3","c"));
            System.out.println("Coche aceptado");
            taller.pintar("Blanco");
            taller.pintar("Blanco");
            System.out.println(taller.get(1).isTerminado());
            taller.entregar("1");
            taller.aceptar(new Coche("5","c"));
        } catch (TallerException e) {
            System.err.println(e.getMessage());
        }
    }
}
