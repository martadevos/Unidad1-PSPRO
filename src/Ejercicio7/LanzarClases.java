package Ejercicio7;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LanzarClases {
    public static void main(String[] args) {
        ProcessBuilder pb1 = new ProcessBuilder("Java", "TicketCompra.java");
        ProcessBuilder pb2 = new ProcessBuilder("Java", "TicketCompra.java");
        ProcessBuilder pb3 = new ProcessBuilder("Java", "TicketCompra.java");
        pb3.redirectOutput(ProcessBuilder.Redirect.appendTo(new File("C:\\Users\\mdevos\\Desktop\\Programación de Servicios y Procesos\\Unidad1-PSPRO\\src\\Ejercicio7\\salidaProceso3.txt")));
        pb1.directory(new File("C:\\Users\\mdevos\\Desktop\\Programación de Servicios y Procesos\\Unidad1-PSPRO\\src\\Ejercicio7"));
        pb2.directory(new File("C:\\Users\\mdevos\\Desktop\\Programación de Servicios y Procesos\\Unidad1-PSPRO\\src\\Ejercicio7"));
        pb3.directory(new File("C:\\Users\\mdevos\\Desktop\\Programación de Servicios y Procesos\\Unidad1-PSPRO\\src\\Ejercicio7"));
        List<ProcessBuilder> lpb = new ArrayList<ProcessBuilder>();
        lpb.add(pb1);
        lpb.add(pb2);
        lpb.add(pb3);
        try {
            List<Process> p = ProcessBuilder.startPipeline(lpb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
