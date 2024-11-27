package _01_Clases.D_AtributosEstaticos;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int aleatorio = random.nextInt(100);
        for (int i = 0; i < aleatorio; i++) {
            int parImpar=random.nextInt(2);
            if (parImpar==0) {
                Pizza p = new Pizza();
                System.out.println(p.pizzasCreadas);
            } else {
                Pizza.pizzasCreadas++;
            }
        }
        System.out.println(Pizza.pizzasCreadas);
    }
}
