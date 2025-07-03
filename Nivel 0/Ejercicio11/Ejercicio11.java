import java.util.Scanner;

public class Ejercicio11
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int edadAbuelo = scanner.nextInt();
            int edadIglesia = scanner.nextInt();
            if (edadIglesia == 0 && edadAbuelo == 0) {
                break;
            }
            if (edadIglesia > edadAbuelo) {
                System.out.println("SENIL");
            }
            else {
                System.out.println("CUERDO");
            }
        }
    }
}