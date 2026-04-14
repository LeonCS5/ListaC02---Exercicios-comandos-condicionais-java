//Ex12
//Leia um numero inteiro; se for positivo calcule o logaritmo, senao mostre numero invalido.

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Numero invalido");
        } else {
            double logaritmo = Math.log(numero);
            System.out.println("Logaritmo natural de " + numero + ": " + logaritmo);
        }

        scanner.close();
    }
}