package _02_ClasesGenerales;

import java.util.Random;

public class C_ArrayList2 {
    private int size;
    private int[] data;

    public C_ArrayList2() {
        data = new int[10];
        size = 0;
    }

    public C_ArrayList2(int size) {
        this.size = 0;
        data = new int[size];
    }

    public void ensureCapacity(int capacity) {
        int newSize = capacity * ((capacity/2) + 1);
        int[] newData = new int[newSize];
        if (size>0) {
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
        }
        data = newData;
    }

    public void set(int index, int value) {
        if (index<size) {
            data[index] = value;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }

    public int get(int index) {
        if (size>index) {
            return data[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int size() {
        return size;
    }

    public void add(int value) {
        if (size==data.length) {
            ensureCapacity(size + 1);
        }
        data[size] = value;
        size++;
    }

    public void add(int index, int value) {
        if (size==data.length) {
            ensureCapacity(size + 1);
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = value;
        size++;
    }

    public void remove(int index) {
        for (int i=index; i<size-1; i++) {
            data[i] = data[i+1];
        }
        size--;
    }

    public void remove(int beginIndex, int endIndex) {
        int[] nuevosDatos = new int[size]; // _ _ _ _  ---> 1, 2 ---> _ _
        for (int i = 0; i < beginIndex; i++) {
            nuevosDatos[i] = data[i];
        }
        for (int i = endIndex; i < nuevosDatos.length;i++){
            nuevosDatos[i] = data[i];
        }
        data = nuevosDatos;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (size >1) {
            result.append("[ ");
            result.append(data[0]);
            for (int i = 1; i < size; i++) {
                result.append(", ");
                result.append(data[i]);
            }
            result.append(" ]");
        } else if (size ==1) {
            result.append(String.format("[ %d ]", data[0]));
        } else {
            result.append("[ ]");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        C_ArrayList2 matriz = new C_ArrayList2(10);
        Random r = new Random();
        for (int i=0; i<7; i++) {
            matriz.add(r.nextInt(11));
        }

        System.out.println(matriz);

        matriz.add(2, 33);
        System.out.println(matriz);

        matriz.remove(2);
        System.out.println(matriz);

    }
}
