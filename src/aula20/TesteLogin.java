package aula20;

import java.util.Scanner;

public class TesteLogin {
    public static void main(String[] args) {
        SistemaLogin sistema = new SistemaLogin();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        try {
            sistema.fazerLogin(usuario, senha);
        } catch (LoginInvalidoException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();

    }
}
