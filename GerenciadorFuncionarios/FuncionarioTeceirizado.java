package GerenciadorFuncionarios;

class FuncionarioTerceirizado extends Funcionario {
    private double custoPorProjeto;

    public FuncionarioTerceirizado(String nome, double salario, String cargo, double custoPorProjeto) {
        super(nome, salario, cargo);
        this.custoPorProjeto = custoPorProjeto;
    }

    @Override
    public double calcularVencimentos() {
        return salario + custoPorProjeto;
    }
}