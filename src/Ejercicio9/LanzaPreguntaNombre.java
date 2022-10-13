package Ejercicio9;

import java.io.*;

public class LanzaPreguntaNombre {
    public static void main(String[] args){
        //Declara variables
        String entrada, salida;
        Runtime rt = Runtime.getRuntime();
        //Declara un array con el comando ¡¡¡¡¡IMPORTANTE!!!!! poner la ruta de la clase java, no solo "nombreClase.java"
        String[] comando = {"Java","src\\Ejercicio5\\PreguntaNombre.java"};
        try {
            //Inicia el proceso lento
            Process p = rt.exec(comando);
            //Toma la entrada del fichero y la pasa al proceso preguntaNombre
            OutputStream os = p.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter escribirEntrada = new BufferedWriter(osw);
            InputStream is = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader leerSalida = new BufferedReader(isr);
            BufferedReader leerEntrada = new BufferedReader(new FileReader("src\\Ejercicio9\\entradaNombre.txt"));
            //Lee la la entrada del fichero
            entrada = leerEntrada.readLine();
            //Pasa la entrada a la clase
            escribirEntrada.write(entrada);
            //Cierra buffers de entrada
            escribirEntrada.close();
            leerEntrada.close();
            //Lee la salida
            salida = leerSalida.readLine();
            while (salida!=null){
                //Escribe la salida en el fichero y hace un salto de línea
                System.out.println(salida);
                //Lee una nueva línea
                salida = leerSalida.readLine();
            }
            //Cierra buffers de salida
            leerSalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
