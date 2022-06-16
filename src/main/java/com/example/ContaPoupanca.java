package com.example;

import com.example.Enums.enumEstadoConta;
import com.example.Enums.enumTipoCliente;
import com.example.Enums.enumTipoDeConta;

public class ContaPoupanca extends Conta {
    private enumTipoDeConta tipoDeConta = enumTipoDeConta.CONTA_POUPANCA;
    private enumEstadoConta estadoConta = enumEstadoConta.FECHADA;

    public enumTipoDeConta getTipoDeConta() {
        return tipoDeConta;
    }

    @Override
    public void abrirConta(Conta cliente, enumTipoDeConta tipoDeConta, enumTipoCliente tipoDeCliente){
        if(tipoDeCliente.getNomeTipoCliente().equals("Pessoa Jurídica")){
            System.out.println("Cliente PJ não pode abrir conta poupança");
        } else{
            cliente.setTipoDeConta(tipoDeConta);
            cliente.setEstadoConta(enumEstadoConta.ABERTA);
            System.out.println("Conta aberta com sucesso!");
        }
        
    } 

    
}
