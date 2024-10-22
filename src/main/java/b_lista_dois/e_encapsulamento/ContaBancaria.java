package b_lista_dois.e_encapsulamento;

public class ContaBancaria {

    private double saldo;
    private String titular;

    public ContaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valorDeposito){
        if (valorDeposito > 0){
            saldo = saldo + valorDeposito;
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }

//    public boolean sa



}

//(Encapsulamento) -
// Crie uma classe ContaBancaria com
// atributos privados saldo e titular,
// métodos para depositar e sacar, e
// utilize encapsulamento.