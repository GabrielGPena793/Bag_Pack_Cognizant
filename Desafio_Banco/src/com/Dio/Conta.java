package com.Dio;

public abstract class Conta {
    private final int AGENCIA_PADRAO = 1;
    private static int sequencial = 1;

    protected   int agencia , numero;
    protected double saldo;

    public Conta() {
        this.numero = sequencial++;
        this.agencia = this.AGENCIA_PADRAO;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
        else System.out.println("Saldo insuficiente!");
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
