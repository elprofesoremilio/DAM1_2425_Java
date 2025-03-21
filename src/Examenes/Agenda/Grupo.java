package Examenes.Agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Grupo {
    private String nombre;
    List<Contacto> contactos;

    public Grupo(String nombre) {
        this.nombre = nombre;
        contactos = new LinkedList<>();
    }

    public void agregarContacto(Contacto c) {
        contactos.add(c);
    }

    public void eliminarContacto(Contacto c) {
        contactos.remove(c);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- Grupo: ").append(nombre).append(" ----");
        for (Contacto c : contactos) {
            result.append("\n").append(c);
        }
        return result.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void guardarCSV() {
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get("contactos.txt"))) {
            bw.write(nombre);
            for (Contacto contacto : contactos) {
                bw.write(contacto.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo");
        }
    }

    public void cargarCSV() {
        this.contactos.clear();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("contactos.txt"))) {
            String linea;
            Pattern pattern = Pattern.compile("([^,]+)");
            Matcher matcher;
            linea = br.readLine();
            if (linea==null) {
                return;
            }
            
            nombre = linea;
            while ((linea=br.readLine())!=null) {
                String[] dato = linea.split(",");
                contactos.add(new Contacto(dato[0],dato[1],dato[2]));
            }
        } catch (IOException e) {
            System.err.println("Error al cargar datos");
        }
    }
}
