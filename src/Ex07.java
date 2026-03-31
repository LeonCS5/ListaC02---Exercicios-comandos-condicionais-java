//Ex07
//Fac ̧a um programa que receba dois numeros e mostre o maior. Se por acaso, os dois  ́
//numeros forem iguais, imprima a mensagem  ́ N ́umeros iguais.
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Números iguais.");
        }

        scanner.close();
    }
}