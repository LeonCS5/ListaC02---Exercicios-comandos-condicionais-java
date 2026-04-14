//Ex11
//Leia um numero inteiro maior que zero e calcule a soma de seus algarismos.


import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que zero: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Número inválido");
        } else {
            int soma = 0;

            while (numero > 0) {
                soma += numero % 10; // pega o último dígito
                numero /= 10;        // remove o último dígito
            }

            System.out.println("Soma dos algarismos: " + soma);
        }

        sc.close();
    }
}