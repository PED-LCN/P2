package aula016;

public class Gerente extends Funcionario {

     public Gerente(String nome, String cpf, double salario, String dataNascimento) {
        super(nome, cpf, salario, dataNascimento);
    }

    @Override
    public double getSalario() {
        return super.getSalario() + 2000.00;
    }

    public String getTipoCargo() {
        String gerente = "Gerente";
        return gerente;
    }
}
