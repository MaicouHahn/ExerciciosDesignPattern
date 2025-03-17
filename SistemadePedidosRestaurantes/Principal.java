package SistemadePedidosRestaurantes;

public class Principal {
    public static void main(String[] args) {
        Pedido pedidoPresencial = new Pedido(1);
        pedidoPresencial.adicionarItem(new Item("Hamburguer", 15.0));
        pedidoPresencial.adicionarItem(new Item("Refrigerante", 5.0));
        System.out.println("Total do pedido presencial: R$" + pedidoPresencial.calcularTotal());

        PedidoDelivery pedidoDelivery = new PedidoDelivery(2, 10.0);
        pedidoDelivery.adicionarItem(new Item("Pizza", 30.0));
        pedidoDelivery.adicionarItem(new Item("Suco", 7.0));
        System.out.println("Total do pedido delivery: R$" + pedidoDelivery.calcularTotal());
    }
}
