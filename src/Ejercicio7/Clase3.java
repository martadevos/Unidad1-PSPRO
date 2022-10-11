package Ejercicio7;

import java.util.Scanner;

public class Clase3 {

    public static void main(String[] args) {
        //Declara variables
        Scanner s = new Scanner(System.in);
        String ip, claseIp = "";
        String[] ipSeparada;
        int numsIp;
        //Repite mientras haya líneas
        while (s.hasNextLine()) {
            //Lee una línea y la mete en una cadena
            ip = s.nextLine();
            //Separa la cadena en los puntos
            ipSeparada = ip.split("\\.");
            //Pasa a entero el primer número de la cadena
            numsIp = Integer.parseInt(ipSeparada[0]);
            //Clasifica las ip
            if (numsIp > 0 && numsIp < 128) {
                //Si el número está entre 0 y 127, la clase es A
                System.out.printf("%s A\n", ip);
            } else if (numsIp > 127 && numsIp < 192) {
                //Si el número está entre 128 y 191, la clase es B
                System.out.printf("%s B\n", ip);
            } else if (numsIp > 191 && numsIp < 224) {
                //Si el número es mayor de 191 la clase es C
                System.out.printf("%s C\n", ip);
            }
        }
        s.close();
    }
}
