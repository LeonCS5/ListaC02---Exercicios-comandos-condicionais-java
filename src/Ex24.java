//Ex24
//Calcule o preco final de um produto aplicando imposto conforme estado de destino.
import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite o estado de destino (MG, SP, RJ ou MS): ");
        String estado = scanner.next().toUpperCase();

        double taxa;

        if (estado.equals("MG")) {
            taxa = 0.07;
        } else if (estado.equals("SP")) {
            taxa = 0.12;
        } else if (estado.equals("RJ")) {
            taxa = 0.15;
        } else if (estado.equals("MS")) {
            taxa = 0.08;
        } else {
            System.out.println("Estado invalido.");
            scanner.close();
            return;
        }

        double precoFinal = valorProduto + (valorProduto * taxa);

        System.out.println("Preco final: " + precoFinal);

        scanner.close();
    }
}