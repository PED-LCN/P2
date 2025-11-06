package aula016;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public static void main(String[] args) {
        boolean verificador = true;

        while(verificador) {
            mostrarMenu();
            System.out.println("Digite o que deseja escolher:");
            int i = sc.nextInt();
            sc.nextLine();

            switch (i){
                case 1:
                    adicionarFuncionario(1);
                    break;
                case  2:
                    adicionarFuncionario(2);
                    break;
                case 3:
                    for (Funcionario funcionario: funcionarios){
                        System.out.println(funcionario.toString());
                    }
                    break;
                case 4:
                    System.out.println("Informe o CPF");
                    String cpf = sc.nextLine();

                    for (Funcionario pessoa : funcionarios) {
                        if (cpf.equals(pessoa.getCpf())) {
                            System.out.printf("O Salário de %s é: R$%.2f%n", pessoa.getNome(), pessoa.getSalario());
                            break;
                        }
                        else {
                            System.out.println("cpf invalido");
                        }
                    }
                    break;
                case 5:
                    System.out.println("FIM PROGRAMA");
                    verificador = false;
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
        sc.close();
    }

    public static void mostrarMenu(){
        System.out.println("\nMENU");
        System.out.println("[1]  adicionar atendente");
        System.out.println("[2]  adicionar gerente");
        System.out.println("[3]  Mostrar funcionarios ");
        System.out.println("[4]  Mostrar salario");
        System.out.println("[5]  Sair");
    }

    public static void adicionarFuncionario(int i){
        System.out.println("Digite o nome:");
        String nome = sc.nextLine();

        System.out.println("Digite o cpf:");
        String cpf = sc.nextLine();

        System.out.println("Digite o salario R$");
        double salario = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a data de nascimento [D/M/A]:");
        String dataNascimento = sc.nextLine();

        if(i ==1){
            System.out.println("Digite a comissão R$");
            double comissao = sc.nextDouble();
            sc.nextLine();

            Atendente novoAtendente = new Atendente(nome,cpf,salario,dataNascimento,comissao);
            funcionarios.add(novoAtendente);
        }
        else{
            Gerente novoGerente = new Gerente(nome,cpf,salario,dataNascimento);
            funcionarios.add(novoGerente);
        }
    }

}
