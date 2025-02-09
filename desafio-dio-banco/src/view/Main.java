package view;

import model.Banco;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        
        // Criando cliente
        Cliente cliente01 = new Cliente("Renan", "123.456.789.01");
        Cliente cliente02 = new Cliente("Daiane", "789.456.123.02");
        

        // Criando contas
        Conta cc = new ContaCorrente(cliente01);
        Conta cp = new ContaPoupanca(cliente02);

        // Criando Banco e add as contas.
        Banco banco = new Banco("Banco Digital");
        banco.adicionarCliente(cliente01);
        banco.adicionarConta(cc);
        banco.adicionarCliente(cliente02);
        banco.adicionarConta(cp);

        // Operacoes        
        cc.depositar(1000);
        cc.sacar(200);
        cc.transferir(300.0,cp);
        cc.sacar(100);
        cp.depositar(500);

        // Imprimir
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        // Lista clientes
        banco.listarClientes();
        banco.listarContas();
    }
}
