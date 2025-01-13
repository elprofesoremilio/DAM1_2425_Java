package ListasEjercicios.ClasesSueltas;

public class E5_Cancion {
    private String titulo;
    private String interprete;
    private int duracion; // en segundos
    private String genero;

    public E5_Cancion(String titulo, String interprete, int duracion, String genero) {
        this.titulo = titulo;
        this.interprete = interprete;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion>=0) {
            this.duracion = duracion;
        } else {
            System.out.println("Duración establecida en 0 por ser negativa");
            this.duracion = 0;
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void mostrarDetalles() {
        System.out.println("Título: " + this.titulo + ".\n" +
                "Intérprete: " + this.interprete + ".\n" +
                "Duración: " + this.duracion + " segundos.\n" +
                "Género: " + this.genero);
    }

    public String duracion() {
        int minutos = this.duracion/60;
        int segundos = this.duracion%60;

        return String.format("%02d:%02d", minutos, segundos);
    }

    public static void main(String[] args) {
        E5_Cancion tukituki = new E5_Cancion("Burrito Sabanero", "Villancico popular", 233, "Villancico");

        tukituki.mostrarDetalles();
        System.out.println(tukituki.duracion());
    }

}
