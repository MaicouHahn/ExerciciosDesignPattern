package GerenciadorFuncionarios;

public class Funcionario {
    protected String nome;
    protected double salario;
    protected String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double calcularVencimentos() {
        return salario;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Cargo: " + cargo + ", Salário: " + calcularVencimentos());
    }
}
