package SistemaPagamento;

public class Compra {
    private double valor;

    public Compra(double valor) {
        this.valor = valor;
    }

    public void realizarPagamento(MetodoPagamento metodo) {
        metodo.pagar(valor);
    }

    public static void main(String[] args) {
        Compra compra = new Compra(150.0);

        MetodoPagamento cartao = new CartaoCredito();
        MetodoPagamento paypal = new PayPal();
        MetodoPagamento boleto = new Boleto();

        compra.realizarPagamento(cartao);
        compra.realizarPagamento(paypal);
        compra.realizarPagamento(boleto);
    }
}