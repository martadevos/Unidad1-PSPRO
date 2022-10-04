package Ejercicio5;

import java.util.Scanner;

public class PreguntaNombre {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nombre;
        nombre = s.nextLine();
        System.out.printf("¡Hola %s!\n", nombre);
        s.close();
    }
}
