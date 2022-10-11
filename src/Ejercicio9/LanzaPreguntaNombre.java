package Ejercicio9;

import java.io.*;

public class LanzaPreguntaNombre {
    public static void main(String[] args){
        //Declara variables
        String salida;
        Runtime rt = Runtime.getRuntime();
        //Declara un array con el comando ¡¡¡¡¡IMPORTANTE!!!!! poner la ruta de la clase java, no solo "nombreClase.java"
        String[] comando = {"Java","src\\Ejercicio5\\PreguntaNombre.java"};
        try {
            //Inicia el proceso lento
            Process p = rt.exec(comando);
            //Toma la salida del proceso lento y lo escribe en un fichero con buffers
            OutputStream os = p.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter escribir = new BufferedWriter(osw);
            BufferedReader leer = new BufferedReader(new FileReader("src\\Ejercicio9\\entradaNombre.txt"));
            //Lee la salida
            salida = leer.readLine();
            //Escribe la salida en el fichero y hace un salto de línea
            escribir.write(salida);
            //Cierra buffers
            escribir.close();
            leer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
