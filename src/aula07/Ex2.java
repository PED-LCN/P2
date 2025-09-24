package aula07;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade dop nadador: ");
        int idade = sc.nextInt();
        sc.close();

        switch (idade) {
            case 1,2,3,4 -> System.out.println("Não classificado!");
            case 5,6,7 -> System.out.println("Infantil A");
            case 8,9,10 -> System.out.println("Infantil B");
            case 11,12,13 -> System.out.println("Juvenil A");
            case 14,15,16,17 -> System.out.println("Juvenil B");
            default -> System.out.println("Adulto");
        }
    }
}
