package Ejercicio8;

import java.io.*;

public class LanzaProcesoLentoRuntime {
    public static void main(String[] args){
        //Declara variables
        String salida;
        Runtime rt = Runtime.getRuntime();
        //Declara un array con el comando ¡¡¡¡¡IMPORTANTE!!!!! poner la ruta de la clase java, no solo "nombreClase.java"
        String[] comando = {"Java","src\\ProcesoLento.java"};
        try {
            //Inicia el proceso lento
            Process p = rt.exec(comando);
            //Toma la salida del proceso lento y lo escribe en un fichero con buffers
            InputStream is = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader leer = new BufferedReader(isr);
            BufferedWriter escribir = new BufferedWriter(new FileWriter("src\\Ejercicio8\\salidaProcesoLento2.txt"));
            //Lee la salida
            salida = leer.readLine();
            //Lo hace hasta que salida sea nulo
            while (salida!=null){
                //Escribe la salida en el fichero y hace un salto de línea
                escribir.write(salida);
                escribir.newLine();
                //Lee una nueva línea
                salida = leer.readLine();
            }
            //Cierra buffers
            escribir.close();
            leer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
