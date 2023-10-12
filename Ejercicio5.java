import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de pesetas que quiere convertir:");
        int pesetas = sc.nextInt();
        double euros = 0.0060;
        double conversion = euros*pesetas;
        System.out.println("Conversion: "+pesetas +" pesetas son "+conversion+" euros");
        sc.close();
    }
}
