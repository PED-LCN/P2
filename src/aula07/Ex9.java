package aula07;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int senha;
        Scanner input = new Scanner(System.in);
            System.out.println("Digite a senha:");
            senha = input.nextInt();
        while(senha != 1234){
            System.out.println("Senha invalida!");
            System.out.println("Digite a senha:");
            senha = input.nextInt();
        }
        System.out.println("Senha valida!");


    }
}
