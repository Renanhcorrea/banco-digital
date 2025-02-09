package model;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente titular;

    public Conta (Cliente titular) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.titular = titular;
    }

    protected void imprimirInfoComuns(){
        System.out.println(String.format("Titular: %s", this.titular.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public void sacar(double valor) {
        if (valor > saldo){
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor > saldo){
            System.out.println("Saldo insuficiente!");
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

}
