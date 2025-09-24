package aula07;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.close();

        if (idade > 15 && idade < 70) {
            System.out.println("Seu voto é obrigatório!");
        }
        else {
            System.out.println("Não é obrigado a votar!");
        }
    }
}
