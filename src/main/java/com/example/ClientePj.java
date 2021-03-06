package com.example;
import com.example.Enums.enumTipoCliente;
import com.example.Enums.enumTipoDeConta;


public class ClientePj extends Conta {
    private String nome;
    private String cnpj;
    private enumTipoCliente tipoCliente = enumTipoCliente.PESSOA_JURIDICA;
    private enumTipoDeConta tipoDeConta = enumTipoDeConta.CONTA_CORRENTE;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public enumTipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public enumTipoDeConta getTipoDeConta() {
        return tipoDeConta;
    }

    @Override
    public String toString() {
        return "ClientePj [Nome=" + nome + ", CNPJ=" + cnpj + ", Tipo de Cliente=" + this.getTipoCliente().getNomeTipoCliente()+
        ", Estado da Conta="+ this.getEstadoConta().getNomeEstadoConta()+", Tipo de Conta="+ 
        this.getTipoDeConta().getNomeTipoDeConta()+", Saldo="+ this.getSaldo()+
        "]";
    }

    
  
}
