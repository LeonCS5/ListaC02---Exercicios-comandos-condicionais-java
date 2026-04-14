//Ex14
//Calcule a media ponderada (2, 3 e 5) e classifique o aluno em reprovado, recuperacao ou aprovado.

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