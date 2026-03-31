//2
//Leia um numero fornecido pelo usu  ́ ario. Se esse n  ́ umero for positivo, calcule a raiz  ́
//quadrada do numero. Se o n  ́ umero for negativo, mostre uma mensagem dizendo que o  ́
//numero  ́ e inv  ́ alido.

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero >= 0) {
            double raiz = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero +  " é: " + raiz);
        } else {
            System.out.println("Número inválido! Digite um valor positivo.");
        }

        scanner.close();
    }
}
