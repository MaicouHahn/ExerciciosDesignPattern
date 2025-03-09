package SistemaRelatorios;

public class PdfRelatorio implements Relatorio {
    @Override
    public void gerar(String[] dados) {
        System.out.print("Gerando relatório em PDF com os dados: ");
        for (String dado : dados) {
            System.out.print(dado + " ");
        }
        System.out.println();
    }
}