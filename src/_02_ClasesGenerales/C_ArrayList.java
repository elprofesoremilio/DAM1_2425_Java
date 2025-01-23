package _02_ClasesGenerales;

import java.util.Random;

public class C_ArrayList {
    private int longitud;
    private int[] datos;

    public C_ArrayList(int longitud) {
        this.longitud = longitud;
        datos = new int[longitud];
    }

    public void setDato(int index, int value) {
        datos[index] = value;
    }

    public int getDato(int i) {
        return datos[i];
    }

    public int size() {
        return longitud;
    }
    
    public void setSize(int longitud) {
        this.longitud = longitud;
        int[] nuevosDatos = new int[longitud];
        for (int i = 0; i < datos.length; i++) {
            nuevosDatos[i] = datos[i];
        }
        datos = nuevosDatos;
    }

    public void add(int value) {
        setSize(longitud+1);
        datos[longitud-1] = value;
    }

    public void add(int index, int value) {
        longitud++;
        int[] nuevosDatos = new int[longitud];
        for (int i = 0; i < index; i++) {
            nuevosDatos[i] = datos[i];
        }
        nuevosDatos[index] = value;
        for (int i = index+1; i<nuevosDatos.length; i++) {
            nuevosDatos[i] = datos[i-1];
        }
        datos = nuevosDatos;
    }

    public static void main(String[] args) {
        C_ArrayList matriz = new C_ArrayList(5);
        Random r = new Random();
        for (int i=0; i<matriz.size(); i++) {
            matriz.setDato(i,r.nextInt(11)); // matriz[i] = r.nextInt(11);
        }

        System.out.print("[");
        for (int i=0; i<matriz.size(); i++) {
            System.out.print(" "+matriz.getDato(i));
        }
        System.out.println(" ]");

        matriz.setSize(7);
        matriz.setDato(matriz.size()-1, 88);
        matriz.add(77);

        System.out.print("[");
        for (int i=0; i<matriz.size(); i++) {
            System.out.print(" "+matriz.getDato(i));
        }
        System.out.println(" ]");

        matriz.add(2, 33);
        matriz.add(0, 0);
        matriz.add(matriz.size()-1, 99);
        matriz.add(matriz.size(), 99);


        System.out.print("[");
        for (int i=0; i<matriz.size(); i++) {
            System.out.print(" "+matriz.getDato(i));
        }
        System.out.println(" ]");
    }
}
