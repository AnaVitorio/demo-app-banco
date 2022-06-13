package com.example;

import com.example.Enums.enumTipoCliente;
import com.example.Enums.enumTipoDeConta;

public class Cliente extends Conta {
    private String nome;
    private enumTipoCliente tipoCliente;
    private String cpfCnpj;
    private enumTipoDeConta tipoDeConta;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public enumTipoCliente getTipoCliente() {
        return tipoCliente;
    }
    public void setTipoCliente(enumTipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }
    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public enumTipoDeConta getTipoDeConta() {
        return tipoDeConta;
    }
    public void setTipoDeConta(enumTipoDeConta tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }
    
}
