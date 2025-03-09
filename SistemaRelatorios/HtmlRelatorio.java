package SistemaRelatorios;

public class HtmlRelatorio implements Relatorio {
    @Override
    public void gerar(String[] dados) {
        System.out.print("Gerando relatório em HTML com os dados: ");
        for (String dado : dados) {
            System.out.print(dado + " ");
        }
        System.out.println();
    }
}