package com.example.Interfaces;

import java.math.BigDecimal;

import com.example.Conta;
import com.example.Enums.enumTipoCliente;
import com.example.Enums.enumTipoDeConta;

public interface Funcoes {
    public void abrirConta(Conta cliente, enumTipoDeConta tipoDeConta, enumTipoCliente tipoDeCliente);
    public void depositar(Conta cliente, BigDecimal valor);
    public void transferir(Conta clienteQueRecebe, BigDecimal valor);
    public BigDecimal consultarSaldo();
    
}
