package EjerciciosClase.ClasesYObjetos.Producto;

public class Producto {
    private String nombre;
    private int stock;
    private double precio;

    public Producto(String nombre, int stock, double precio) {
        this.nombre = nombre; 

        if (precio > 0) {
            this.precio = precio;
        } else {
            this.precio = 0;
        }

        // Condición de asignación simplificada
        this.stock = (stock>0) ? stock : 0;

    }

    public boolean compararStock(Producto producto) {
        return producto.stock == this.stock;
    }

    public boolean aumentarStock(int cantidad) {
        if (cantidad > 0) {
            this.stock+=cantidad;
            return true;
        } else {
            return false;
        }
    }

    public boolean disminuirStock(int cantidad) {
        if (cantidad > 0 && stock>=cantidad) {
            this.stock-=cantidad;
            return true;
        } else {
            return false;
        }
    }

    public double calcularCoste(int cantidad) {
        return cantidad * precio;
    }

    public double costeTotal() {
        return precio * stock;
    }

    public static void main(String[] args) {
        Producto pepsi = new Producto("Bebida de cola", 100, 1.5);
        Producto cocacola = new Producto("Bebida de cola", 100, 1.5);

        System.out.println(pepsi.aumentarStock(50));
        System.out.println(cocacola.disminuirStock(50));
        System.out.println(cocacola.disminuirStock(100));
        System.out.println(cocacola.disminuirStock(-50));
        System.out.println(pepsi.aumentarStock(-100));

        System.out.println(pepsi.stock);
        System.out.println(cocacola.stock);

        System.out.println(pepsi.calcularCoste(100));
        System.out.println(cocacola.costeTotal());

    }
}
