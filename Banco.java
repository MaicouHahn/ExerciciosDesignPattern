
import java.util.ArrayList;
import java.util.List;

class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo da conta " + numero + ": R$" + saldo);
    }
}

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void criarConta(int numero, double saldoInicial) {
        contas.add(new Conta(numero, saldoInicial));
        System.out.println("Conta " + numero + " criada com saldo inicial de R$" + saldoInicial);
    }

    public Conta encontrarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.criarConta(123, 1000);
        Conta conta = banco.encontrarConta(123);
        if (conta != null) {
            conta.depositar(500);
            conta.sacar(200);
            conta.consultarSaldo();
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}
