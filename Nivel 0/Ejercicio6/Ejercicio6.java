import java.util.Scanner;

public class Ejercicio6
{
   public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in);
       while (true) {
           int vivienda = scanner.nextInt();
           if (vivienda == 0) {
               break;
           }
           if (vivienda % 2 == 0) {
               System.out.println("DERECHA");
           }
          
           else {
               System.out.println ("IZQUIERDA");
           }
       }
   }
}