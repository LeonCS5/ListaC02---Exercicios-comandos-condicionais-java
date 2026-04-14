//Ex29
//Gere cinco perguntas de soma com numeros aleatorios e mostre respostas corretas e total de acertos.
import java.util.Random;
import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int acertos = 0;

        for (int i = 1; i <= 5; i++) {
            int a = random.nextInt(100) + 1;
            int b = random.nextInt(100) + 1;
            int respostaCorreta = a + b;

            System.out.print("Pergunta " + i + ": qual e a soma de " + a + " + " + b + "? ");
            int respostaUsuario = scanner.nextInt();

            System.out.println("Resposta correta: " + respostaCorreta);

            if (respostaUsuario == respostaCorreta) {
                acertos++;
                System.out.println("Acertou.");
            } else {
                System.out.println("Errou.");
            }
        }

        System.out.println("Total de acertos: " + acertos);

        scanner.close();
    }
}