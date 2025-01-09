package _03_Clases.A_EstructuraBasica.ClasesSueltas;

public class Pelicula {
    String titulo;
    String director;
    int anio;
    String genero;

    Pelicula(String titulo, String director, int anio, String genero) {
        this.anio = anio;
        this.director = director;
        this.titulo = titulo;
        this.genero = genero;
    }

    void mostrarDatos() {
        String mensaje = "Título: " + titulo + ".\n" +
                "Director: " + director + ".\n" +
                "Género: " + genero + ".\n" +
                "Año: " + anio + ".";
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        Pelicula bambi = new Pelicula("Bambi", "Disney", 1970, "Penoso");
        bambi.mostrarDatos();
    }
}
