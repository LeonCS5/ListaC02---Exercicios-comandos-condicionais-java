//Ex25
//Resolva uma equacao do segundo grau e informe as raizes conforme o valor de delta.
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Nao e equacao de segundo grau.");
            scanner.close();
            return;
        }

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            System.out.println("Nao existe raiz.");
        } else if (delta == 0) {
            double raiz = (-b) / (2 * a);
            System.out.println("Raiz unica: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }

        scanner.close();
    }
}