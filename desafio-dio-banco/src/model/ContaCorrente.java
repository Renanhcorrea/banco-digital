package model;
public class ContaCorrente extends Conta {

    private double limeteEspecial = 500.00;

    public ContaCorrente(Cliente titular) {
        super(titular);
    }

    @Override
    public void sacar(double valor){
        if (valor > saldo + limeteEspecial){
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfoComuns();       
    }

}
