//Ex04
//Faça um programa que leia um numero e, caso ele seja positivo, calcule e mostre:
//O numero digitado ao quadrado
//A raiz quadrada do numero digitado
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero >= 0) {
            double raiz = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + raiz);

            double quadrado = Math.pow(numero, 2);
            System.out.println("O número " + numero +" ao quadrado é: " + quadrado);
        } else {
            System.out.println("O número é negativo");
        }

        scanner.close();
    }
}
