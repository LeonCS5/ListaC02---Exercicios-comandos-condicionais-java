//Ex19
//Verifique se um numero inteiro e divisivel por 3 ou 5, mas nao simultaneamente pelos dois.
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        boolean divisivelPor3 = numero % 3 == 0;
        boolean divisivelPor5 = numero % 5 == 0;

        if (divisivelPor3 ^ divisivelPor5) {
            System.out.println("O numero e divisivel por 3 ou 5, mas nao pelos dois ao mesmo tempo.");
        } else {
            System.out.println("O numero nao atende a condicao.");
        }

        scanner.close();
    }
}