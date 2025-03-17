package SistemTransporteUrbano;

public class Principal {
    public static void main(String[] args) {
        Veiculo onibus = new Onibus("Mercedes-Benz", 40, 2.5);
        Veiculo taxi = new Taxi("Toyota Corolla", 4, 0.8);

        System.out.println("Consumo do Ônibus: " + onibus.calcularConsumo(100, 0) + " litros");
        System.out.println("Consumo do Táxi (3 passageiros, 50km): " + taxi.calcularConsumo(50, 3) + " litros");
    }
}