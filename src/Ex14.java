//14. A nota final de um estudante e calculada a partir de tres notas atribuidas entre
// o intervalo de 0 ate 10, respectivamente, a um trabalho de laboratorio, a uma avaliacao
// semestral e a um exame final. A media das tres notas mencionadas anteriormente obedece
// aos pesos: Trabalho de Laboratorio: 2; Avaliacao Semestral: 3; Exame Final: 5.
// De acordo com o resultado, mostre na tela se o aluno esta reprovado (media entre 0 e 2,9),
// de recuperacao (entre 3 e 4,9) ou se foi aprovado. Faca todas as verificacoes necessarias.

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do trabalho de laboratorio: ");
        double laboratorio = scanner.nextDouble();

        System.out.print("Digite a nota da avaliacao semestral: ");
        double semestral = scanner.nextDouble();

        System.out.print("Digite a nota do exame final: ");
        double exameFinal = scanner.nextDouble();

        if (laboratorio < 0 || laboratorio > 10 || semestral < 0 || semestral > 10 || exameFinal < 0 || exameFinal > 10) {
            System.out.println("Nota invalida. O programa sera encerrado.");
        } else {
            double media = (laboratorio * 2 + semestral * 3 + exameFinal * 5) / 10.0;

            System.out.println("Media final: " + media);

            if (media <= 2.9) {
                System.out.println("Aluno reprovado.");
            } else if (media <= 4.9) {
                System.out.println("Aluno em recuperacao.");
            } else {
                System.out.println("Aluno aprovado.");
            }
        }

        scanner.close();
    }
}