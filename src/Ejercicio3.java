import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] comando;
        System.out.println("Introduzca el programa a ejecutar");
        comando = sc.nextLine().split(" ");
        ProcessBuilder pb = new ProcessBuilder(comando);
        pb.directory(new File("C:\\Users\\mdevos\\Desktop\\Programación de Servicios y Procesos\\Unidad1-PSPRO\\src"));
        System.out.println("Voy a lanzar el proceso");
        pb.inheritIO();
        try {
            Process p = pb.start();
            p.waitFor();
            System.out.println("Proceso terminado");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
