package _03_Clases.F_Interfaces;

import java.awt.*;
import java.util.LinkedList;

public class Impresora {
    public static void imprimirConsola(Imprimible documento) {
        System.out.println(documento.toDocument());
    }

    public static void main(String[] args) {
        FiguraGeometrica cuadrado = new FiguraGeometrica();
        cuadrado.add(new Point(0,0))
            .add(new Point(0,10))
            .add(new Point(10,10))
            .add(new Point(10,0));




        Empleado empleado = new Empleado("Pedro", "600123456");

        LinkedList<Imprimible> documentos = new LinkedList<>();

        documentos.add(cuadrado);
        documentos.add(empleado);

        for (Imprimible documento : documentos) {
            Impresora.imprimirConsola(documento);
        }
    }
}
