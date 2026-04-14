//Ex10
//Fac ̧a um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu
//peso ideal, utilizando as seguintes formulas (onde  ́ h corresponde a altura): `
//• Homens: (72.7 ∗ h) − 58
//• Mulheres: (62, 1 ∗ h) − 44, 7

import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura da pessoa (em metros): ");
        double h = scanner.nextDouble();

        System.out.println("Digite o sexo da pessoa (M/F): ");
        char sexo = scanner.next().charAt(0);

        double pesoIdeal;

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * h) - 58;
            System.out.printf("O peso ideal para um homem com altura %.2f m é: %.2f kg%n", h, pesoIdeal);
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * h) - 44.7;
            System.out.printf("O peso ideal para uma mulher com altura %.2f m é: %.2f kg%n", h, pesoIdeal);
        } else {
            System.out.println("Sexo inválido. Por favor, digite M para masculino ou F para feminino.");
        }

    }
}
