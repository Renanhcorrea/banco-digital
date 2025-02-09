package model;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private String nome; 
    private List<Conta> contas = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public Banco(String nome){
        this.nome = nome;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);       
    }

    public void listarClientes(){
        System.out.println("Cliente do Banco " + nome + ":");
        for (Cliente c : clientes) {
            System.out.println("- " + c.getNome()+ " (CPF: "+ c.getCpf() + ")");
        }
    }

    public void listarContas(){
        System.out.println("Contas do Banco " + nome + ":");
        for (Conta c : contas) {
            System.out.println("- Conta " + c.getNumero() + " (Titular: "+ c.titular.getNome() + ")");
        }
    }




}
