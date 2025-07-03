import java.util.Scanner;

public class Ejercicio15
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        for (int i = 0; i < numero; i++) {
            int numeroPollos = scanner.nextInt();
            System.out.println(numeroPollos + " " + numeroPollos*2);
        }
    }
}