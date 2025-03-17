package GerenciadorFuncionarios;

public class FuncionarioEfetivo extends Funcionario {
    private double bonusAnual;

    public FuncionarioEfetivo(String nome, double salario, String cargo, double bonusAnual) {
        super(nome, salario, cargo);
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double calcularVencimentos() {
        return salario + bonusAnual;
    }
}