package _01_EstructurasControl;

import java.util.Scanner;

public class m_BucleWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean noSalirElegido = true;
        while (noSalirElegido) {
            if (sc.nextLine().equals("salir")) {
                noSalirElegido = false;
            }
        }

    }
}
