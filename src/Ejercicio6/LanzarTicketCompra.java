package Ejercicio6;

import java.io.File;
import java.io.IOException;

public class LanzarTicketCompra {

    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("Java","TicketCompra.java");
        pb.redirectInput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectOutput(ProcessBuilder.Redirect.appendTo(new File("C:\\Users\\mdevos\\Desktop\\Programación de Servicios y Procesos\\Unidad1-PSPRO\\src\\Ejercicio6\\ficheroTicket.txt")));
        pb.directory(new File("C:\\Users\\mdevos\\Desktop\\Programación de Servicios y Procesos\\Unidad1-PSPRO\\src\\Ejercicio6"));
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