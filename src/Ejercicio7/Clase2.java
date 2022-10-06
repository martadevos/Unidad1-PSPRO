package Ejercicio7;

import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] ip = new String[10];
        String[] ipSeparada= new String[4];
        int[] numsIp= new int[4];
        for (int i = 0; i<ip.length; i++){
            ip[i] = s.nextLine();
        }
        for (int i=0; i<ip.length;i++){
            ipSeparada = ip[i].split("\\.");
            for (int j=0; j<numsIp.length; j++) {
                numsIp[j] = Integer.parseInt(ipSeparada[j]);
            }
            if () {
            }
        }
    }
}
