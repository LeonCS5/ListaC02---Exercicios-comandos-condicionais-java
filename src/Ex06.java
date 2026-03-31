//Ex06
//Escreva um programa que, dados dois numeros inteiros, mostre na tela o maior deles,  ́
//assim como a diferenc ̧a existente entre ambos.
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int maior;
        int diferenca;

        if (num1 > num2) {
            maior = num1;
            diferenca = num1 - num2;
        } else {
            maior = num2;
            diferenca = num2 - num1;
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Diferença: " + diferenca);

        scanner.close();
    }
}


