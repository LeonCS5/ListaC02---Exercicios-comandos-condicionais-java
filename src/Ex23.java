//Ex23
//Determine se um ano e bissexto de acordo com as regras de divisibilidade.
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        boolean bissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);

        if (bissexto) {
            System.out.println("Ano bissexto.");
        } else {
            System.out.println("Ano nao bissexto.");
        }

        scanner.close();
    }
}