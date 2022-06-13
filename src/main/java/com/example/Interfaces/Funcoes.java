package com.example.Interfaces;

import com.example.Cliente;

public interface Funcoes {
    public void abrirConta(String nome, int numeroTipoCliente, int numeroTipoDeConta);
    public void depositar(Cliente cliente, double valor);
    public void transferir(Cliente cliente, double valor);
    public double consultarSaldo();
    
}
