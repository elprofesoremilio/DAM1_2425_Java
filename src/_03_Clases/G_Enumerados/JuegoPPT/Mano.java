package _03_Clases.G_Enumerados.JuegoPPT;

public enum Mano {
    PIEDRA, PAPEL, TIJERA;

    public boolean gana(Mano mano) {
        switch (this) {
            case PIEDRA:
                return mano==TIJERA;
            case TIJERA:
                return mano==PAPEL;
            default:
                return mano==PIEDRA;
        }
    }

}
