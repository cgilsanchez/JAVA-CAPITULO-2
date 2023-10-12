import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de euros que quiere convertir:");
        int euros = sc.nextInt();
        double pesetas = 166.386;
        double conversion = euros*pesetas;
        System.out.println("Conversion: "+euros +" euros son "+conversion+" pesetas");
        sc.close();
    }
}
