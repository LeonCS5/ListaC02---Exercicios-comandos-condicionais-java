//Ex03
//Leia um numero real. Se o numero for positivo imprima a raiz quadrada. Do contr  ́ ario,  ́
//imprima o numero ao quadrado.
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            double raiz = Math.sqrt(numero);
            System.out.println("A raiz quadrada é: " + raiz);
        } else {
            double quadrado = Math.pow(numero, 2);
            System.out.println("O número ao quadrado é: " + quadrado);
        }

        scanner.close();
    }
}
