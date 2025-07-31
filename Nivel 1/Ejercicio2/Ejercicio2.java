import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double espacio = scanner.nextDouble() / 1000.0; // metros -> km
            double velocidadMaxima = scanner.nextDouble(); // km/h
            double tiempo = scanner.nextDouble() / 3600.0; // segundos -> horas
            double velocidadCoche = espacio / tiempo;
            if (espacio == 0 && velocidadMaxima == 0 && tiempo == 0) {
                break;
            }
            else if (velocidadCoche < velocidadMaxima) {
                System.out.println("OK");
            } 
            else if ((velocidadCoche + velocidadMaxima * 0.2) < velocidadMaxima) {
                System.out.println("MULTA");
            } 
            else if ((velocidadCoche + velocidadMaxima * 0.2)> velocidadMaxima) {
                System.out.println("PUNTOS");
            }
            else {
                System.out.println("ERROR");
            }
        }
        scanner.close();
    }
}
