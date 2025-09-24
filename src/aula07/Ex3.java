package aula07;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o combustivél[A/G]: ");
        char combustivel = sc.next().charAt(0);

        System.out.println("Informe A Litragem abastecida: ");
        double Litros = sc.nextDouble();
        sc.close();

        double preco;
        switch(combustivel) {
            case 'A':
                if (Litros <= 20) {
                    preco = Litros * 5.82 ;
                    System.out.printf("O valor a pagar: R$ %f",preco);
                }
                else {
                    preco = Litros * 5.7;
                    System.out.printf("O valor a pagar: R$ %f",preco);
                }
                break;
            case 'G':
                if (Litros <= 20) {
                    preco = Litros * 4.32;
                    System.out.printf("O valor a pagar: R$ %f",preco);
                }
                else{
                    preco = Litros * 4.23;
                    System.out.printf("O valor a pagar: R$ %f",preco);
                }
        }

    }
}
