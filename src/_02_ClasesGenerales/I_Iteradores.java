package _02_ClasesGenerales;

import java.util.*;

public class I_Iteradores {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Azul");
        lista.add("Verde");
        lista.add("Verde");
        lista.add("Naranja");
        lista.add("Morado");
        lista.add("Gris");

        System.out.println(lista);


        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals("Verde")) {
                lista.remove(i);
            }
        }

        System.out.println(lista);

        lista.clear();
        lista.add("Verde");
        lista.add("Azul");
        lista.add("Verde");
        lista.add("Verde");
        lista.add("Naranja");
        lista.add("Morado");
        lista.add("Gris");

        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String actual = iterator.next();
            if (actual.equals("Verde")) {
                iterator.remove();
            }
        }

        System.out.println(lista);

        lista.clear();
        lista.add("Rojo");
        lista.add("Azul");
        lista.add("Verde");
        lista.add("Verde");
        lista.add("Naranja");
        lista.add("Morado");
        lista.add("Gris");


        ListIterator<String> listIterator = lista.listIterator();
        while (listIterator.hasNext()) {
            String color = listIterator.next();
            if (color.equals("Verde")) {
                listIterator.remove();
                listIterator.add("Negro");
            }
        }

        System.out.println(lista);

    }

}
