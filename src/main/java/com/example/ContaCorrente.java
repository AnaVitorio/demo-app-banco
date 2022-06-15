package com.example;

import com.example.Enums.enumTipoDeConta;

public class ContaCorrente extends Conta {
    private enumTipoDeConta tipoDeConta = enumTipoDeConta.CONTA_CORRENTE;

    public enumTipoDeConta getTipoDeConta() {
        return tipoDeConta;
    }

}
