//Ex09
//Leia o salario de um trabalhador e o valor da prestac ̧  ́ ao de um empr  ̃ estimo. Se a  ́
//prestac ̧ao for maior que 20% do sal  ̃ ario imprima:  ́ Empr ́estimo n~ao concedido, caso
//contrario imprima:  ́ Empr ́estimo concedido.

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do trabalhador: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o valor da prestação do empréstimo: ");
        double prestacao = scanner.nextDouble();
        
        double limite = salario * 0.20;

        if (prestacao > limite) {
            System.out.println("Empréstimo não concedido.");
        } else {
            System.out.println("Empréstimo concedido.");
        }

        scanner.close();
    }
}
