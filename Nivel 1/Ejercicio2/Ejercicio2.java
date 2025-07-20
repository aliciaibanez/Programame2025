import java.util.Scanner;

public class Ejercicio2
{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double distanciaRecorrida = scanner.nextDouble();
            double velocidadMaxima = scanner.nextDouble();
            double segundosEnRecorrer = scanner.nextDouble();
            if (distanciaRecorrida == 0 && velocidadMaxima == 0 && segundosEnRecorrer == 0) {
                break;
            }
            double velocidadCoche = distanciaRecorrida/segundosEnRecorrer;
            if (velocidadCoche < velocidadMaxima) {
                System.out.println("OK");
            }
            else if (velocidadCoche < (velocidadMaxima * 1.2)) {
                System.out.println("MULTA");
            }
            else if (velocidadCoche >= (velocidadMaxima * 1.2)) {
                System.out.println("PUNTOS");
            }
        }
    }
}