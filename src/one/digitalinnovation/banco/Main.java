package one.digitalinnovation.banco;

import one.digitalinnovation.banco.entities.Agencia;
import one.digitalinnovation.banco.entities.Banco;
import one.digitalinnovation.banco.entities.Cliente;
import one.digitalinnovation.banco.entities.Conta;
import one.digitalinnovation.banco.entities.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Banco itau = new Banco("Itau");
        Agencia aracaju = new Agencia("AG-ARACAJU", "Av. Desembargador M.");
        Conta clientePoupanca = new ContaPoupanca(aracaju, 100.00);
        Cliente clienteAracaju = new Cliente("Jose");
        clienteAracaju.adicionaContas(clientePoupanca);
        itau.adicionaCliente(clienteAracaju);
    }
}
