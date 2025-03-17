package SistemadePedidosRestaurantes;

class PedidoDelivery extends Pedido {
    private double taxaEntrega;

    public PedidoDelivery(int numero, double taxaEntrega) {
        super(numero);
        this.taxaEntrega = taxaEntrega;
    }

    @Override
    public double calcularTotal() {
        return super.calcularTotal() + taxaEntrega;
    }
}
