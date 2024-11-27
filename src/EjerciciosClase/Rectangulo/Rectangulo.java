package EjerciciosClase.Rectangulo;

public class Rectangulo {
    int x, y;
    private int ancho;
    private int alto;

    public Rectangulo(int x, int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(int ancho, int alto) {
        this(0,0,ancho,alto);
    }

    public int perimetro() {
        return ancho + ancho + alto + alto;
    }

    public int area() {
        return ancho * alto;
    }
}
