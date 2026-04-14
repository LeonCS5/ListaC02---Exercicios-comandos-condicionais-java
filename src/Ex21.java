//Ex21
//Leia uma opcao de menu e execute soma, diferenca, produto ou divisao entre dois numeros.
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a opcao:");
        System.out.println("1 - Soma de 2 numeros");
        System.out.println("2 - Diferenca entre 2 numeros (maior pelo menor)");
        System.out.println("3 - Produto entre 2 numeros");
        System.out.println("4 - Divisao entre 2 numeros (o denominador nao pode ser zero)");
        System.out.print("Opcao: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        if (opcao == 1) {
            System.out.println("Resultado: " + (numero1 + numero2));
        } else if (opcao == 2) {
            System.out.println("Resultado: " + (Math.max(numero1, numero2) - Math.min(numero1, numero2)));
        } else if (opcao == 3) {
            System.out.println("Resultado: " + (numero1 * numero2));
        } else if (opcao == 4) {
            if (numero2 == 0) {
                System.out.println("Nao e possivel dividir por zero.");
            } else {
                System.out.println("Resultado: " + (numero1 / numero2));
            }
        } else {
            System.out.println("Opcao invalida.");
        }

        scanner.close();
    }
}