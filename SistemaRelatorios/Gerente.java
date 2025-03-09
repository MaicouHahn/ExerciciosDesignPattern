package SistemaRelatorios;

public class Gerente {
    public void solicitarRelatorio(Relatorio relatorio, String[] dados) {
        relatorio.gerar(dados);
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        String[] dados = {"Vendas", "Lucro", "Despesas"};

        Relatorio pdf = new PdfRelatorio();
        Relatorio excel = new ExcelRelatorio();
        Relatorio html = new HtmlRelatorio();

        gerente.solicitarRelatorio(pdf, dados);
        gerente.solicitarRelatorio(excel, dados);
        gerente.solicitarRelatorio(html, dados);
    }
}