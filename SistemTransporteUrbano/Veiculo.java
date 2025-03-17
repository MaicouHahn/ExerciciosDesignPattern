package SistemTransporteUrbano;

abstract class Veiculo {

    protected String modelo;
    protected int capacidade;

    public Veiculo(String modelo, int capacidade) {
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    public abstract double calcularConsumo(double distancia, int passageiros);

}
