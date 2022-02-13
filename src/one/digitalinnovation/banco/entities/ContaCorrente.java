package one.digitalinnovation.banco.entities;

import java.util.List;

public class ContaCorrente extends Conta{

    public ContaCorrente(Agencia agencia, double saldo) {
        super(agencia, saldo);
    }

    @Override
    public Agencia getAgencia() {
        return super.agencia;
    }

    @Override
    public int getConta() {
        return super.conta;
    }

    @Override
    public double getSaldo() {
        return super.saldo;
    }


    @Override
    public void sacar(double valor) {
        super.historico.add("-" + String.valueOf(valor));
        super.conta -= valor;
    }

    @Override
    public void depositar(double valor) {
        super.historico.add("+" + String.valueOf(valor));
        super.conta += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        super.historico.add("-" + String.valueOf(valor));
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimeExtrato() {
        System.out.println("EXTRATO CONTA CORRENTE");
        for (String hist : super.historico){
            System.out.println(hist);
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                '}';
    }
}
