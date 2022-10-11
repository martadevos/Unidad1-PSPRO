package Ejercicio7;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LanzarClases {
    public static void main(String[] args) {
        //Declara Prodess Builders
        ProcessBuilder pb1 = new ProcessBuilder("Java", "Clase1.java");
        ProcessBuilder pb2 = new ProcessBuilder("Java", "Clase2.java");
        ProcessBuilder pb3 = new ProcessBuilder("Java", "Clase3.java");
        //Dirige los errores a la salida estándar
        pb1.redirectError(ProcessBuilder.Redirect.INHERIT);
        pb2.redirectError(ProcessBuilder.Redirect.INHERIT);
        pb3.redirectError(ProcessBuilder.Redirect.INHERIT);
        //Redirige la salida del proceso 3 a un fichero
        pb3.redirectOutput(new File("C:\\Users\\mdevos\\Desktop\\Programación de Servicios y Procesos\\Unidad1-PSPRO\\src\\Ejercicio7\\salidaProceso3.txt"));
        //Declara los directorios
        pb1.directory(new File("C:\\Users\\mdevos\\Desktop\\Programación de Servicios y Procesos\\Unidad1-PSPRO\\src\\Ejercicio7"));
        pb2.directory(new File("C:\\Users\\mdevos\\Desktop\\Programación de Servicios y Procesos\\Unidad1-PSPRO\\src\\Ejercicio7"));
        pb3.directory(new File("C:\\Users\\mdevos\\Desktop\\Programación de Servicios y Procesos\\Unidad1-PSPRO\\src\\Ejercicio7"));
        //Declara la lista de Process Builders
        List<ProcessBuilder> lpb = new ArrayList<ProcessBuilder>();
        //Añade los procesos a la lista
        lpb.add(pb1);
        lpb.add(pb2);
        lpb.add(pb3);
        try {
            //Inicia los procesos pasando la salida de uno como entrada del siguiente
            List<Process> p = ProcessBuilder.startPipeline(lpb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
