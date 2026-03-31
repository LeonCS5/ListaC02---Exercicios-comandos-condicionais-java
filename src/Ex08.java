//Ex08
//Fac ̧a um programa que leia 2 notas de um aluno, verifique se as notas sao v  ̃ alidas e  ́
//exiba na tela a media destas notas. Uma nota v  ́ alida deve ser, obrigatoriamente, um  ́
//valor entre 0.0 e 10.0, onde caso a nota nao possua um valor v  ̃ alido, este fato deve ser  ́
//informado ao usuario e o programa termina.

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        if (nota1 < 0.0 || nota1 > 10.0) {
            System.out.println("Nota inválida! Programa encerrado.");
            scanner.close();
            return;
        }

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        if (nota2 < 0.0 || nota2 > 10.0) {
            System.out.println("Nota inválida! Programa encerrado.");
            scanner.close();
            return;
        }

        double media = (nota1 + nota2) / 2.0;
        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}