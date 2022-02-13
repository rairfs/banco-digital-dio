package one.digitalinnovation.banco.entities;

import java.util.ArrayList;
import java.util.List;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Agencia agencia, double saldo) {
        super(agencia, saldo);
        super.historico = new ArrayList<>();
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
        super.saldo -= valor - 3.5;
    }

    @Override
    public void depositar(double valor) {
        super.historico.add("+" + String.valueOf(valor));
        super.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        super.historico.add("-" + String.valueOf(valor));
        this.sacar(valor + 10);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimeExtrato() {
        System.out.println("EXTRATO CONTA POUPANÇA");
        for (String hist : super.historico){
            System.out.println(hist);
        }
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                '}';
    }
}
