import java.util.Scanner;
public class Ejercicio8
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            for (int i = 0; i<numero; i++) {
                System.out.print(1);
            }
            System.out.println();
        }
    }
}
