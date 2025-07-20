import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int caloriasQuemadas = Integer.parseInt(scanner.nextLine());
            if (caloriasQuemadas == 0) {
                break;
            }
            int comidas = Integer.parseInt(scanner.nextLine());
            String caloriasAQuemar = scanner.nextLine();
            String [] caloriasAQuemarPartes = caloriasAQuemar.split(" ");
            int caloriasAQuemarTotal = 0;
            for (String listaCalorias : caloriasAQuemarPartes) {
                caloriasAQuemarTotal += Integer.parseInt(listaCalorias);
            }
            System.out.println ((caloriasAQuemarTotal + caloriasQuemadas - 1) / caloriasQuemadas);
        }
    }
}