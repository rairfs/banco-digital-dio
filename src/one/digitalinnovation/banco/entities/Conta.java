package one.digitalinnovation.banco.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
    private static int CONTA_SEQUENCIAL = 1;

    protected Agencia agencia;
    protected int conta;
    protected double saldo;
    protected List<String> historico;

    public Conta(Agencia agencia, double saldo) {
        this.conta = CONTA_SEQUENCIAL++;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public abstract Agencia getAgencia();

    public abstract int getConta();

    public abstract double getSaldo();

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public abstract void transferir(double valor, Conta contaDestino);

    public abstract void imprimeExtrato();
}
