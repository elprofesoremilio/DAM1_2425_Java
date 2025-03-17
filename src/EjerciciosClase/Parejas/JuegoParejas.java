package EjerciciosClase.Parejas;

public class JuegoParejas {
    private Mesa mesa;
    public JuegoParejas(int dificultad) {
        crearMesa(dificultad);
        mesa.colocarCartas();
    }

    private void crearMesa(int dificultad) {
        int numeroParejas;
        switch (dificultad) {
            case 2:
                numeroParejas = 8;
                break;
            case 3:
                numeroParejas = 12;
                break;
            case 1:
            default:
                numeroParejas = 5;
                break;
        }
        mesa = new Mesa(numeroParejas);
    }

}
