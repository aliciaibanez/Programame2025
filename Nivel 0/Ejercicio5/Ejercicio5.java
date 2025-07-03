import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String frase = scanner.nextLine();
            String [] frasePartes = frase.split(" ");
            String nombre = frasePartes[1];
            System.out.println ("Hola, " + nombre + ".");
        }
    }
}
