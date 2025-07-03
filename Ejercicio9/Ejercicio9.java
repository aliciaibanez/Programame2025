import java.util.Scanner;

public class Ejercicio9
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numero; i++) {
            String nombre = scanner.nextLine();
            String parentesco = scanner.nextLine();
            if (nombre.equals("Luke") && parentesco.equals("padre")) {
                System.out.println("TOP SECRET");
            }
            else {
                System.out.println(nombre + ", " + "yo soy tu " + parentesco);
            }
        }
    }
}
