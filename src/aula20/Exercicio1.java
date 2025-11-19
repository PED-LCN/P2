package aula20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sucesso = false;

        while (!sucesso) {
            try {
                System.out.print("Digite o primeiro número inteiro: ");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número inteiro: ");
                int numero2 = scanner.nextInt();

                double resultado = (double) numero1 / numero2;
                System.out.println("O resultado da divisão é: " + resultado);
                sucesso = true;

            } catch (InputMismatchException e) {
                System.out.println("Erro: Você deve digitar um número inteiro. Tente novamente.");
                scanner.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Erro: Não é possível dividir por zero. Tente novamente.");
            }
        }
        scanner.close();
    }
}
