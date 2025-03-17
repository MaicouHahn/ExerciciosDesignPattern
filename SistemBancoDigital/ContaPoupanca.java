package SistemBancoDigital;

class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(String numero, double saldo, double taxaJuros) {
        super(numero, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
        saldo += saldo * (taxaJuros / 100);
        System.out.println("Juros aplicados. Novo saldo: R$ " + saldo);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Saldo atual: R$ " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }
    }
}
