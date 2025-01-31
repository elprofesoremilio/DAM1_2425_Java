package _03_Clases.F_Interfaces;

import java.awt.*;
import java.util.LinkedList;

public class FiguraGeometrica implements Imprimible {
    LinkedList<Point> puntos;

    public FiguraGeometrica() {
        puntos = new LinkedList<>();
    }

    public FiguraGeometrica add(Point p) {
        puntos.add(p);
        return this;
    }

    @Override
    public String toDocument() {
        StringBuilder document = new StringBuilder();
        for (Point p : puntos) {
            document.append(p.x).append(",").append(p.y).append("\n");
        }
        return document.toString();
    }
}
