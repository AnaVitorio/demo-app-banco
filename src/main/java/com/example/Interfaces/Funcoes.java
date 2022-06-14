package com.example.Interfaces;

import com.example.Conta;
import com.example.Enums.enumTipoDeConta;

public interface Funcoes {
    public void abrirConta(Conta cliente, enumTipoDeConta tipoDeConta);
    public void depositar(Conta cliente, double valor);
    public void transferir(Conta clienteQueRecebe, double valor);
    public double consultarSaldo();
    
}
