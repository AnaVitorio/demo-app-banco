package com.example;

import com.example.Enums.enumTipoCliente;

public class Cliente extends Conta {
    private enumTipoCliente tipoCliente;
    private String nome;

    public enumTipoCliente getTipoCliente() {
        return tipoCliente;
    }
    public void setTipoCliente(enumTipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
