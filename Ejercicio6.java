import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduze el precio del articulo");
    int precioArti = sc.nextInt();
    double calculo = precioArti*0.21 + (precioArti);
    System.out.println("El total de la factura es "+ calculo+" euros");
    sc.close();
    }
}
