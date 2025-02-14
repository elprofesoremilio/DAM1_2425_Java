package _02_ClasesGenerales;

import java.io.File;
import java.io.IOException;

public class G_ClaseFile {
    public static void main(String[] args) {
        File file = new File("E:\\PROG\\crearArchivo.txt");
        File directory = new File("E:\\PROG");

        if (!directory.exists()) {
            if (directory.mkdir()) {
                System.out.println("Directorio creado");
            } else {
                System.err.println("No se pudo crear el directorio");
            }
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("Archivo creado");
            } catch (IOException e) {
                System.err.println("Archivo no creado");
            }
//        } else {
//            if (file.delete()) {
//                System.out.println("Archivo borrado");
//            } else {
//                System.out.println("Archivo no borrado");
//            }
        }

        String fileDatos = String.format(
            "Nombre: %s\n" +
            "Ruta absoluta: %s\n" +
            "Lectura: %s\n" +
            "Escritura: %s\n" +
            "Ejecución: %s\n",
            file.getName(),
            file.getAbsolutePath(),
            file.canRead(),
            file.canWrite(),
            file.canExecute()
        );

        System.out.println(fileDatos);

        if (directory.isDirectory()) {
            String[] contenido = directory.list();
            System.out.printf("Listar directorio: %s\n", directory.getAbsolutePath());
            for (String nombre: contenido) {
                System.out.println(nombre);
            }
        }

    }
}
