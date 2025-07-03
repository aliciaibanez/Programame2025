import java.util.Scanner;
public class Ejercicio2
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            int dia = scanner.nextInt();
            int mes = scanner.nextInt();
            if (dia == 25 && mes == 12) {
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    }
