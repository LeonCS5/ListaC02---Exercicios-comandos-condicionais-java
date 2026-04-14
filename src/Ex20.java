//Ex20
//Leia tres lados, verifique se formam triangulo e classifique em equilatero, isosceles ou escaleno.
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o lado B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o lado C: ");
        double c = scanner.nextDouble();

        boolean formaTriangulo = a < b + c && b < a + c && c < a + b;

        if (!formaTriangulo) {
            System.out.println("Os valores nao formam um triangulo.");
        } else if (a == b && b == c) {
            System.out.println("Triangulo equilatero.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triangulo isosceles.");
        } else {
            System.out.println("Triangulo escaleno.");
        }

        scanner.close();
    }
}