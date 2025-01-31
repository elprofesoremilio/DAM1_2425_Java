package _02_ClasesGenerales;

// T --> Type --> tipos primitivos
// E --> Elementos de colecciones
// K, V --> Key, Value --> llave, valor
import java.util.*;

public class D_ListaArray<E> extends ArrayList<E> implements List<E> {
    private int size;
    private Object[] data;

    public D_ListaArray() {
        data = new Object[10];
        size = 0;
    }

    public D_ListaArray(int size) {
        this.size = 0;
        data = new Object[size];
    }

    public void ensureCapacity(int capacity) {
        int newSize = capacity * ((capacity/2) + 1);
        Object[] newData = new Object[newSize];
        if (size>0) {
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
        }
        data = newData;
    }

    @Override
    public E set(int index, E value) {
        E oldValue = get(index);
        if (index<size) {
            data[index] = value;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
        return oldValue;
    }

    @Override
    public E get(int index) {
        if (size>index) {
            return (E) data[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(E value) {
        if (size==data.length) {
            ensureCapacity(size + 1);
        }
        data[size] = value;
        size++;
        return true;
    }

    @Override
    public void add(int index, E value) {
        if (size==data.length) {
            ensureCapacity(size + 1);
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = value;
        size++;
    }

    @Override
    public E remove(int index) {
        E oldValue = get(index);
        for (int i=index; i<size-1; i++) {
            data[i] = data[i+1];
        }
        size--;
        return oldValue;
    }

    public void remove(int beginIndex, int endIndex) {
        if (beginIndex<0 || beginIndex>size || endIndex<0 || endIndex>size) {
            throw new IndexOutOfBoundsException();
        }
        if (beginIndex>endIndex) {
            int aux = beginIndex;
            beginIndex = endIndex;
            endIndex = aux;
        }
        int tramo = endIndex - beginIndex;
        for (int i = endIndex; i < size;i++){
            data[i-tramo] = data[i];
        }
        size -= tramo;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object value) {
        for (Object o : data) {
            if (o.equals(value)) {
                return true;
            }
        }
        return false;
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

    //TODO ejemplo con otra clase

    public static void main(String[] args) {
        String[] posiblesDatos = {"casa","bicicleta","ayuntamiento","avión","portaviones","mesa","perro"
            ,"rubia","patata","anacardo"};


        D_ListaArray<String> matriz = new D_ListaArray<>(10);
        ArrayList<String> arrayList = new ArrayList<>(10);

        Random r = new Random();
        for (int i=0; i<7; i++) {
            int index = r.nextInt(posiblesDatos.length);
            matriz.add(posiblesDatos[index]);
            arrayList.add(posiblesDatos[index]);
        }

        System.out.println(matriz);
        System.out.println(Arrays.toString(arrayList.toArray()));

        matriz.add(5, "mosaico");
        arrayList.add(5, "mosaico");

        matriz.set(2,"orangután");
        arrayList.set(2,"orangután");
        System.out.println(matriz);
        System.out.println(Arrays.toString(arrayList.toArray()));

        System.out.println(matriz.get(matriz.size()-1));
        System.out.println(arrayList.get(matriz.size()-1));

        matriz.remove(matriz.size()-1);
        matriz.remove(1,3);
        arrayList.remove(matriz.size()-1);
        System.out.println(matriz);
        System.out.println(Arrays.toString(arrayList.toArray()));

    }
}

