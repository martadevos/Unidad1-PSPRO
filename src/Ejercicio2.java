import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("Java","ProcesoLento.java");
        pb.directory(new File("C:\\Users\\mdevos\\Desktop\\Programación de Servicios y Procesos\\Unidad1-PSPRO\\src"));
        System.out.println("Voy a lanzar el proceso");
        pb.inheritIO();
        try {
            Process p = pb.start();
            while (p.isAlive()){
                System.out.println("Proceso ejecutándose");
                Thread.sleep(3000);
            }
            System.out.println("Proceso terminado");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}