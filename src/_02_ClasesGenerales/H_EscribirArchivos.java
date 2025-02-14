package _02_ClasesGenerales;

import java.io.*;

public class H_EscribirArchivos {
    public static void main(String[] args) {
        // try-with-resources
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\PROG\\crearArchivo.html")))) {
            bw.write("Mi primera escritura de archivo: Hola, archivo");
            bw.newLine();
            bw.write("<strong>Adiós</strong> archivo.");
        } catch (FileNotFoundException e) {
            System.err.println("No se pudo abrir el archivo");
        } catch (IOException e) {
            System.err.println("No se pudo escribir en el archivo");
        }
    }
}
