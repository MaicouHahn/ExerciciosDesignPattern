package GerenciamentoTarefas;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }

    public void exibirDetalhes() {
        String status = concluida ? "Concluída" : "Pendente";
        System.out.println("Descrição: " + descricao + " | Status: " + status);
    }
}
