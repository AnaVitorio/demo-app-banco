package com.example.Interfaces;

import com.example.Cliente;
import com.example.Enums.enumTipoDeConta;

public interface Funcoes {
    public void abrirConta(Cliente cliente, enumTipoDeConta tipoDeConta);
    public void depositar(Cliente cliente, double valor);
    public void transferir(Cliente cliente, double valor);
    public double consultarSaldo();
    
}
