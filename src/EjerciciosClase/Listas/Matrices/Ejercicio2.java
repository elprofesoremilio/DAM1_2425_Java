package EjerciciosClase.Listas.Matrices;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] num = new int[12];

        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        System.out.print("["+num[0]);
        for (int i=1; i<num.length; i++) {
            System.out.print(","+num[i]);
        }
        System.out.println("]");
    }
}
