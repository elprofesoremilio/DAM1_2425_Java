package EjerciciosClase.Parejas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Estadistica {
    private List<Registro> estadisticas;

    public Estadistica() {
        estadisticas = new LinkedList<>();
        estadisticas.add(new Registro("Pepito", 3,20));
        estadisticas.add(new Registro("Juan", 1,8));
        estadisticas.add(new Registro("María", 2,14));
    }

    public void guardar() {
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get("estadisticas.txt"))) {
            for (Registro registro : estadisticas) {
                bw.write(registro.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar");
        }
    }

    public void cargar() {
        estadisticas.clear();
        Pattern pattern = Pattern.compile("([^,]+)");

        try (BufferedReader br = Files.newBufferedReader(Paths.get("estadisticas.txt"))) {
            String linea;
            while ((linea=br.readLine())!=null) {
                Matcher matcher = pattern.matcher(linea);
                matcher.find();
                String nombre = matcher.group();
                matcher.find();
                Instant registro = Instant.parse(matcher.group());
                matcher.find();
                int dificultad = Integer.parseInt(matcher.group());
                matcher.find();
                int movimientos = Integer.parseInt(matcher.group());
                estadisticas.add(new Registro(nombre,registro,dificultad,movimientos));
            }
        } catch (IOException e) {
            System.err.println("Error al cargar datos");
        }

        for (Registro r : estadisticas) {
            System.out.println(r);
        }

    }
}
