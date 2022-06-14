package com.example;
import com.example.Enums.enumTipoCliente;


public class ClientePj extends Cliente {
    private String cnpj;
    private enumTipoCliente tipoCliente = enumTipoCliente.PESSOA_JURIDICA;
    //private String tipoDeConta = "Conta Corrente";


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
