//Ex30
//Leia tres numeros e exiba-os em ordem crescente.
import java.util.Arrays;
import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int primeiro = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int segundo = scanner.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int terceiro = scanner.nextInt();

        int[] numeros = {primeiro, segundo, terceiro};
        Arrays.sort(numeros);

        System.out.println("Ordem crescente: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);

        scanner.close();
    }
}