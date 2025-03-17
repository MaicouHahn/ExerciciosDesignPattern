package SistemadePedidosRestaurantes;

import java.util.ArrayList;
import java.util.List;

class Pedido {
    private int numero;
    private List<Item> itens;

    public Pedido(int numero) {
        this.numero = numero;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}