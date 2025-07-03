import java.util.Scanner;

public class Ejercicio10
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.nextLine();

        for (int i=0; i<numero; i++) {
            int neto = scanner.nextInt();
            int total = scanner.nextInt();
            System.out.println(total-neto);
        }
    }
}