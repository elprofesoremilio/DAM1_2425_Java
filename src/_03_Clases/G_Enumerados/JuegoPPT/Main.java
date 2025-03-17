package _03_Clases.G_Enumerados.JuegoPPT;

public class Main {
    public static void main(String[] args) {
        Mano mano = Mano.PIEDRA;
        Mano mano2 = Mano.PAPEL;

        System.out.println(mano.gana(mano2));
    }
}
