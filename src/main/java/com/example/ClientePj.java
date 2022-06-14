package com.example;
import com.example.Enums.enumTipoCliente;


public class ClientePj extends Conta {
    private String nome;
    private String cnpj;
    private enumTipoCliente tipoCliente = enumTipoCliente.PESSOA_JURIDICA;
    //private String tipoDeConta = "Conta Corrente";

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

    // public String getTipoDeConta() {
    //     return tipoDeConta;
    // }
  
}
