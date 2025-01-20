import java.util.Random;
import java.util.Scanner;

public class MainParte1 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        //declaro y creo un scanner para poder leer de teclado
        Random aleatorio = new Random();
        //declaro y creo un random para poder obtener numeros aleatorios

        int suma = 0;//creo una variable para la suma de los numeros del usuario y la maquina

        int continuarSalir = 1;//variable para entrar en el bucle y salir

        while (continuarSalir ==1){
            System.out.printf("1-Continuar  2-Salir:  ");//pido una opcion al usuario
            continuarSalir = scanner.nextInt();
            scanner.nextLine();//limpio el buffer por si es necesario mas adelante

            if(continuarSalir == 1){//si se elige contimuar ce suma los puntos correspondientes dependiendo del numero que da la maquina y los que el usuario elige
                int numeroMaquina = aleatorio.nextInt(12) + 1;
                if(numeroMaquina == 1){
                    System.out.printf("¿Suma 1 u 11? ");
                    int opcion = scanner.nextInt();
                    scanner.nextLine();
                    if(opcion == 1){
                        suma = suma +1;
                    }
                    if(opcion == 11){
                        suma = suma +11;
                    }
                }
                if(numeroMaquina == 10 || numeroMaquina == 11 || numeroMaquina == 12) {
                    System.out.printf("Se sumarán 10 \n");
                    suma = suma + 10;
                }
                if(numeroMaquina >1 && numeroMaquina <10 ){
                    suma = suma + numeroMaquina;
                    System.out.printf("Se sumarán "+ numeroMaquina +"\n");
                }
                if(suma > 21){
                    System.out.printf("MALA SUERTE \n");
                }
                if(suma == 21){
                    System.out.printf("ENHORABUENA \n");
                }
            }
            if(suma < 16 && continuarSalir == 2){//Mensaje por si el usuario decide salir
                System.out.printf("ERES UN POCO COBARDE \n");
            }
            if(suma > 16 && continuarSalir == 2){
                System.out.printf("ADIOS \n");
            }
        }
    }
}