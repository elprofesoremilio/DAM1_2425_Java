package EjerciciosClase.Listas.ClasesSueltas;

public class E2_Estudiante {
    private String nombre;
    private String grado;
    private int edad;
    private double promedio;

    public E2_Estudiante(String nombre, String grado, int edad, double promedio) {
        this.edad = edad;
        this.nombre = nombre;
        this.grado = grado;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGrado() {
        return grado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGrado(String grado) {
        if (grado.equals("Superior") || grado.equals("Medio") || grado.equals("Básico")) {
            this.grado = grado;
        } else {
            System.out.println("Grado indicado inexistente");
            this.grado = "Básico";
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>=0) {
            this.edad = edad;
        } else {
            System.out.println("Edad incorrecta");
            this.edad = 0;
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio>=0 && promedio<=10) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio incorrecto");
            this.promedio = 0;
        }
    }

    private boolean comprobarTodo() {
        if (edad<0) {
            return false;
        }
        if (!(grado.equals("Superior") || grado.equals("Medio") || grado.equals("Básico"))) {
            return false;
        }
        if (promedio<0 || promedio>10) {
            return false;
        }
        return true;
    }

    public boolean isAprobado() {
        if (comprobarTodo()) {
            return promedio >= 5;
        } else {
            System.out.println("Algún dato es incorrecto");
            return false;
        }
    }

    public static void main(String[] args) {
        E2_Estudiante pepe = new E2_Estudiante("Pepe", "Superior", 19, 1.0);
        System.out.println("El alumno " + pepe.getNombre() + " supera el curso: " + (pepe.isAprobado()?"Sí":"No"));
    }
}
