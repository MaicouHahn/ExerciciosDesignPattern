package GerenciadorFuncionarios;

public class principal {
    public static void main(String[] args) {
        
        Funcionario efetivo = new FuncionarioEfetivo("Carlos", 5000, "Analista", 2000);
        Funcionario terceirizado = new FuncionarioTerceirizado("Ana", 4000, "Desenvolvedora", 1500);

        efetivo.exibirInformacoes();
        terceirizado.exibirInformacoes();
    }
}
