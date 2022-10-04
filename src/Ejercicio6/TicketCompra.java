package Ejercicio6;

import java.util.Scanner;

public class TicketCompra {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int codProducto, cantProducto;
        double precioProducto, totalProducto;
        codProducto = s.nextInt();
        precioProducto = s.nextDouble();
        cantProducto = s.nextInt();
        totalProducto = cantProducto * precioProducto;
        System.out.printf("%d - %.2f - %d - %.2f\n", codProducto, precioProducto, cantProducto, totalProducto);
        s.close();
    }

}
