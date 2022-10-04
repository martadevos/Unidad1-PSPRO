package Ejercicio5;

import java.io.File;
import java.io.IOException;

public class LanzarPreguntaNombre {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("Java","PreguntaNombre.java");
        pb.redirectInput(new File("C:\\Users\\mdevos\\Desktop\\Programación de Servicios y Procesos\\Unidad1-PSPRO\\src\\Ejercicio5\\ficheroNombre.txt"));
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb.directory(new File("C:\\Users\\mdevos\\Desktop\\Programación de Servicios y Procesos\\Unidad1-PSPRO\\src\\Ejercicio5"));
        System.out.println("Voy a lanzar el proceso");
        try {
            Process p = pb.start();
            p.waitFor();
            System.out.println("Proceso terminado");
        }catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
