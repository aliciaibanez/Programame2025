import java.util.Scanner;

public class Ejercicio3
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++) {
            String palabra = scanner.nextLine().toLowerCase();
            
            if (palabra.equals("colgadas")) {
                System.out.println("Bien");
            }
            
            else {
                System.out.println("Mal");
            }
        }
    }
}