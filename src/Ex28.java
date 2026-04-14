//Ex28
//Leia tres inteiros positivos e calcule a media escolhida: geometrica, ponderada, harmonica ou aritmetica.
import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro positivo: ");
        int x = scanner.nextInt();

        System.out.print("Digite o segundo numero inteiro positivo: ");
        int y = scanner.nextInt();

        System.out.print("Digite o terceiro numero inteiro positivo: ");
        int z = scanner.nextInt();

        if (x <= 0 || y <= 0 || z <= 0) {
            System.out.println("Os numeros devem ser positivos.");
            scanner.close();
            return;
        }

        System.out.println("Escolha o tipo de media:");
        System.out.println("1 - Geometrica");
        System.out.println("2 - Ponderada");
        System.out.println("3 - Harmonica");
        System.out.println("4 - Aritmetica");
        System.out.print("Opcao: ");
        int opcao = scanner.nextInt();

        double media;

        if (opcao == 1) {
            media = Math.cbrt((double) x * y * z);
        } else if (opcao == 2) {
            media = (x + (2 * y) + (3 * z)) / 6.0;
        } else if (opcao == 3) {
            media = 3.0 / ((1.0 / x) + (1.0 / y) + (1.0 / z));
        } else if (opcao == 4) {
            media = (x + y + z) / 3.0;
        } else {
            System.out.println("Opcao invalida.");
            scanner.close();
            return;
        }

        System.out.println("Media: " + media);

        scanner.close();
    }
}