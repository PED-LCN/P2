package aula016;

import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String dataNascimento;

    Funcionario(String nome, String cpf, double salario, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-5s %-5s  R$%.2f", this.nome, this.cpf,this.dataNascimento,getSalario());
    }
}
