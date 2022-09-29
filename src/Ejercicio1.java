import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class Ejercicio1 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("Java","ProcesoLento.java");
        pb.directory(new File("C:\\Users\\mdevos\\Desktop\\Programación de Servicios y Procesos\\Unidad1-PSPRO\\src"));
        System.out.println("Voy a lanzar el proceso");
        pb.inheritIO();
        Map<String, String> mapa=pb.environment();
        Set<String> claves = mapa.keySet();
        for (String clave : claves){
            String valor = mapa.get(clave);
            System.out.println("["+clave+","+valor+"]");
        }
        try {
            Process p = pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
