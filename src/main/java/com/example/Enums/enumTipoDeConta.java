package com.example.Enums;

public enum enumTipoDeConta {
    CONTA_CORRENTE(1, "Conta Corrente"),
    CONTA_POUPANCA(2, "Conta Poupança"),
    CONTA_INVESTIMENTO(3, "Conta Investimento");

    private int numeroTipoDeConta;
    private String nomeTipoDeConta;

    private enumTipoDeConta(int numero, String nome){
        this.numeroTipoDeConta = numero;
        this.nomeTipoDeConta = nome;
    }

    public int getNumeroTipoDeConta() {
        return numeroTipoDeConta;
    }

    public void setNumeroTipoDeConta(int numeroTipoDeConta) {
        this.numeroTipoDeConta = numeroTipoDeConta;
    }

    public String getNomeTipoDeConta() {
        return nomeTipoDeConta;
    }

    public void setNomeTipoDeConta(String nomeTipoDeConta) {
        this.nomeTipoDeConta = nomeTipoDeConta;
    }
}
