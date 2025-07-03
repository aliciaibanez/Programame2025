import java.util.Scanner;

public class Ejercicio14
{
   public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in);
       int numero = scanner.nextInt();
       for (int i = 0; i < numero; i++) {
           int anio = scanner.nextInt();
           if (anio < 0) {
               System.out.println (anio);
           }
           else {
               System.out.println (anio-1);
           }
       }
   }
}