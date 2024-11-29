package EjerciciosClase.HacerCiclo;

import java.util.Random;

public class MainCiclo {
    public static void main(String[] args) {
        Random random = new Random();
        Estudiante estudiante = new Estudiante(random.nextBoolean(), random.nextBoolean());
        System.out.println(estudiante.getBachillerato() + " " + estudiante.getCicloMedio());
        System.out.println(estudiante.puedeMatricularSuperior());
    }
}
