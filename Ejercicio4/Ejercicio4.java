import java.util.Scanner;
public class Ejercicio4
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();

        for (int i=0; i<n; i++) {
            int pagina = scanner.nextInt();
            if (pagina % 2 == 0) {
                System.out.println (pagina+1);
            }
            else {
                System.out.println (pagina-1);
            }
        }
    }
}