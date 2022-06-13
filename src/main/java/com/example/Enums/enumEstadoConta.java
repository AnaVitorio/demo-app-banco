package com.example.Enums;

public enum enumEstadoConta {
    ABERTA(1, "Aberta"),
    FECHADA(2,"Fechada");
    
    private int numeroEstadoConta;
    private String nomeEstadoConta;

    private enumEstadoConta(int numero, String nome){
        this.numeroEstadoConta = numero;
        this.nomeEstadoConta = nome;
    }

    public int getNumeroEstadoConta() {
        return numeroEstadoConta;
    }

    public void setNumeroEstadoConta(int numeroEstadoConta) {
        this.numeroEstadoConta = numeroEstadoConta;
    }

    public String getNomeEstadoConta() {
        return nomeEstadoConta;
    }

    public void setNomeEstadoConta(String nomeEstadoConta) {
        this.nomeEstadoConta = nomeEstadoConta;
    }

}
