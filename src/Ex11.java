//11. Escreva um programa que leia um numero inteiro maior do que zero e devolva, na tela, a ´ soma de todos os seus algarismos. 
// Por exemplo, ao numero 251 corresponder ´ a o valor ´ 8 (2 + 5 + 1). Se o numero lido n ´ ao for maior do que zero, 
// o programa terminar ˜ a com a ´ mensagem “Numero inv ´ alido”. ´ 


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