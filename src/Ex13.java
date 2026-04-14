//13. Faca um algoritmo que calcule a media ponderada das notas de 3 provas.
// A primeira e a segunda prova tem peso 1 e a terceira tem peso 2.
// Ao final, mostrar a media do aluno e indicar se o aluno foi aprovado ou reprovado.
// A nota para aprovacao deve ser igual ou superior a 60 pontos.

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        double prova1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double prova2 = scanner.nextDouble();

        System.out.print("Digite a nota da terceira prova: ");
        double prova3 = scanner.nextDouble();

        double mediaPonderada = (prova1 * 1 + prova2 * 1 + prova3 * 2) / 4.0;

        System.out.println("Media do aluno: " + mediaPonderada);

        if (mediaPonderada >= 60) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }
}