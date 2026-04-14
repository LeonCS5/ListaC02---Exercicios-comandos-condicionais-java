//Ex26
//Calcule o consumo em Km/l e classifique o carro como nao economico, economico ou super economico.
import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distancia percorrida em Km: ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite a quantidade de litros consumidos: ");
        double litros = scanner.nextDouble();

        if (litros <= 0) {
            System.out.println("A quantidade de litros deve ser maior que zero.");
            scanner.close();
            return;
        }

        double consumo = distancia / litros;

        System.out.println("Consumo: " + consumo + " Km/l");

        if (consumo < 8) {
            System.out.println("Venda o carro!");
        } else if (consumo <= 12) {
            System.out.println("Economico!");
        } else {
            System.out.println("Super economico!");
        }

        scanner.close();
    }
}