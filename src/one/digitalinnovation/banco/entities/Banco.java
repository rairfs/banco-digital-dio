package one.digitalinnovation.banco.entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Agencia> listaAgencias = new ArrayList<>();
    private List<Cliente> listaClientes = new ArrayList<>();

    public Banco() {
    }

    public Banco(String nome) {
        this.nome = nome;
    }

    public Banco(String nome, List<Agencia> listaAgencias, List<Cliente> listaClientes) {
        this.nome = nome;
        this.listaAgencias = listaAgencias;
        this.listaClientes = listaClientes;
    }

    public void adicionaAgencia(Agencia agencia){
        listaAgencias.add(agencia);
    }

    public void adicionaCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    public void listaTodasAgencias(){
        for (Agencia ag : listaAgencias){
            System.out.println(ag);
        }
    }

    public void listaClientes(){
        for (Cliente cli : listaClientes){
            System.out.println(cli);
        }
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
