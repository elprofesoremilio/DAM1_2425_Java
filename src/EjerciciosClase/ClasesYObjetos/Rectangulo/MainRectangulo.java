package EjerciciosClase.ClasesYObjetos.Rectangulo;

import java.util.Scanner;

public class MainRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el ancho y el alto: ");

//        System.out.println("Introduzca el ancho y el alto: ");
//        int ancho = scanner.nextInt();
//        System.out.println("Introduzca el alto: ");
//        int alto = scanner.nextInt();
//        Rectangulo rect1 = new Rectangulo(ancho, alto);

        Rectangulo rect1 = new Rectangulo(scanner.nextInt(), scanner.nextInt());
        System.out.printf("Perímetro: %d\nÁrea: %d", rect1.perimetro(), rect1.area() );
    }
}
