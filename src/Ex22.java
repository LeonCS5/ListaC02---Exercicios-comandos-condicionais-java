//Ex22
//Leia idade e tempo de servico e informe se o trabalhador pode se aposentar.
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o tempo de servico: ");
        int tempoServico = scanner.nextInt();

        if (idade >= 65 || tempoServico >= 30 || (idade >= 60 && tempoServico >= 25)) {
            System.out.println("Pode se aposentar.");
        } else {
            System.out.println("Nao pode se aposentar.");
        }

        scanner.close();
    }
}