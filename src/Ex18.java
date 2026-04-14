//Ex18
//Mostre um menu de operacoes matematicas, leia dois valores e execute a opcao escolhida.
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opcao:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.print("Opcao: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        if (opcao == 1) {
            System.out.println("Resultado: " + (valor1 + valor2));
        } else if (opcao == 2) {
            System.out.println("Resultado: " + (valor1 - valor2));
        } else if (opcao == 3) {
            System.out.println("Resultado: " + (valor1 * valor2));
        } else if (opcao == 4) {
            if (valor2 == 0) {
                System.out.println("Nao e possivel dividir por zero.");
            } else {
                System.out.println("Resultado: " + (valor1 / valor2));
            }
        } else {
            System.out.println("Opcao invalida.");
        }

        scanner.close();
    }
}