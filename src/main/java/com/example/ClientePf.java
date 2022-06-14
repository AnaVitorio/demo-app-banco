package com.example;

import com.example.Enums.enumTipoCliente;

public class ClientePf extends Conta {
    private String nome;
    private String cpf;
    private enumTipoCliente tipoCliente = enumTipoCliente.PESSOA_FISICA;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public enumTipoCliente getTipoCliente() {
        return tipoCliente;
    }
    
    @Override
    public String toString() {
        return "ClientePf [Nome=" + nome + ", CPF=" + cpf + ", Tipo de Cliente=" + this.getTipoCliente().getNomeTipoCliente()+
        ", Estado da Conta="+ this.getEstadoConta().getNomeEstadoConta()+", Tipo de Conta="+ 
        this.getTipoDeConta().getNomeTipoDeConta()+", Saldo="+ this.getSaldo()+
        "]";
    }
   
}
