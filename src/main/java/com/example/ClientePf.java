package com.example;

import com.example.Enums.enumTipoCliente;

public class ClientePf extends Cliente {
    private String cpf;
    private enumTipoCliente tipoCliente = enumTipoCliente.PESSOA_FISICA;

    
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
        return "ClientePf [cpf=" + cpf + ", tipoCliente=" + tipoCliente + "]";
    }
   
}
