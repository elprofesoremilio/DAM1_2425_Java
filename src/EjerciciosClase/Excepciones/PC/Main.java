package EjerciciosClase.Excepciones.PC;

public class Main {
    public static void main(String[] args) {
        Pc pc = new Pc(new Placa(4, 128, 3000));

        try {
            pc.add(new RAM(16, 3000));
            pc.add(new RAM(16, 3000));
            pc.add(new RAM(16, 3000));
            pc.add(new RAM(16, 3000));
            System.out.println(pc);
        } catch (RAMException e) {
            System.err.println(e.getMessage());
        }
    }
}
