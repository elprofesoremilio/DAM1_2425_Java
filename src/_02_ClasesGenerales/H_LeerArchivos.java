package _02_ClasesGenerales;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class H_LeerArchivos {
    public static void main(String[] args) {
        // try-with-resources
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\PROG\\crearArchivo.html")))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println("No se pudo abrir el archivo");
        } catch (IOException e) {
            System.err.println("No se pudo escribir en el archivo");
        }
    }
}
