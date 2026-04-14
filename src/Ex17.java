//Ex17
//Calcule a area de um trapezio com base maior, base menor e altura, validando valores positivos.
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base maior: ");
        double baseMaior = scanner.nextDouble();

        System.out.print("Digite a base menor: ");
        double baseMenor = scanner.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();

        if (baseMaior <= 0 || baseMenor <= 0 || altura <= 0) {
            System.out.println("Os valores devem ser maiores que zero.");
            scanner.close();
            return;
        }

        double area = ((baseMaior + baseMenor) * altura) / 2.0;

        System.out.println("Area do trapezio: " + area);

        scanner.close();
    }
}