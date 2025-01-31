package EjerciciosClase;

import java.util.ArrayList;
import java.util.Scanner;

public class Regata {
    public static void main(String[] args) {
        ArrayList<Integer> datos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int dato = sc.nextInt();
        while (dato!=0) {
            datos.add(dato);
            dato = sc.nextInt();
        }

        
    }
}
