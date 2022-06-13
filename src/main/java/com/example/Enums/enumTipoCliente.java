package com.example.Enums;

public enum enumTipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    
    private int numeroTipoCliente;
    private String nomeTipoCliente;

    private enumTipoCliente(int numero, String nome){
        this.numeroTipoCliente = numero;
        this.nomeTipoCliente = nome;
    }

    public int getNumeroTipoCliente() {
        return numeroTipoCliente;
    }

    public void setNumeroTipoCliente(int numeroTipoCliente) {
        this.numeroTipoCliente = numeroTipoCliente;
        conversaoEnum(numeroTipoCliente);
    }

    public String getNomeTipoCliente() {
        return nomeTipoCliente;
    }

    public void setNomeTipoCliente(String nomeTipoCliente) {
        this.nomeTipoCliente = nomeTipoCliente;
    }

    public void conversaoEnum(int numeroTipoCliente){
        if(numeroTipoCliente == 1){
            this.setNomeTipoCliente(enumTipoCliente.PESSOA_FISICA.getNomeTipoCliente());
        }else if(numeroTipoCliente == 2){
            this.setNomeTipoCliente(enumTipoCliente.PESSOA_JURIDICA.getNomeTipoCliente());
        }
    }

}
