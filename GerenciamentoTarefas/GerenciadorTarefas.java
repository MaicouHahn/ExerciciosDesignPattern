package GerenciamentoTarefas;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void marcarTarefaComoConcluida(int index) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.get(index).marcarComoConcluida();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void exibirTarefas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.exibirDetalhes();
        }
    }

    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        gerenciador.adicionarTarefa("Estudar Java");
        gerenciador.adicionarTarefa("Fazer exercícios");
        gerenciador.exibirTarefas();
        gerenciador.marcarTarefaComoConcluida(1);
        gerenciador.exibirTarefas();
    }
}