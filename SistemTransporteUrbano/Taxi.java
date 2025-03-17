package SistemTransporteUrbano;

class Taxi extends Veiculo {
    private double taxaPorPassageiro;

    public Taxi(String modelo, int capacidade, double taxaPorPassageiro) {
        super(modelo, capacidade);
        this.taxaPorPassageiro = taxaPorPassageiro;
    }

    @Override
    public double calcularConsumo(double distancia, int passageiros) {
        return distancia * passageiros * taxaPorPassageiro;
    }
}
