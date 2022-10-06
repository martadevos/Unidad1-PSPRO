package Ejercicio7;

public class Clase1 {
    public static void main(String[] args) {
        String ip;
        int num;
        for (int i = 0; i<10;i++) {
            ip="";
            for (int n = 0; n < 3; n++) {
                num = (int) (Math.random() * 255);
                ip = ip.concat(num + ".");
            }
            num = (int) (Math.random() * 255);
            ip = ip.concat(String.valueOf(num));
            System.out.println(ip);
        }
    }
}
