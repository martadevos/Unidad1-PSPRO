package Ejercicio7;

import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        //Declara variables
        Scanner s = new Scanner(System.in);
        String ip;
        String[] ipSeparada;
        int numsIp;
        //Repite 10 veces
        for (int i = 0; i < 10; i++) {
            //Lee una línea y la mete en una cadena
            ip = s.nextLine();
            //Separa la cadena en los puntos
            ipSeparada = ip.split("\\.");
            //Pasa a entero el primer número de la cadena
            numsIp = Integer.parseInt(ipSeparada[0]);
            //Si el número está entre 0 y 223 lo escribe en pantalla
            if (numsIp >= 0 && numsIp <= 223) {
                System.out.println(ip);
            }
        }
        //Cierra el escáner
        s.close();
    }
}
