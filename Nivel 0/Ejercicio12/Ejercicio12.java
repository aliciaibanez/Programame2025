import java.util.Scanner;
public class Ejercicio12
{
   public static void main (String [] args) {
       Scanner scanner = new Scanner(System.in);
       int numero = scanner.nextInt();
       for (int i = 0; i < numero; i++) {
           int problema = scanner.nextInt();
           System.out.println(problema/100);
       }
   }
}