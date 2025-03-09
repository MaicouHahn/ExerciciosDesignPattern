package SistemaRelatorios;


public class ExcelRelatorio implements Relatorio {
    @Override
    public void gerar(String[] dados) {
        System.out.print("Gerando relatório em Excel com os dados: ");
        for (String dado : dados) {
            System.out.print(dado + " ");
        }
        System.out.println();
    }
}