package com.example;

public class ContaInvestimento extends Conta {
    //Cliente PJ rende 2% a mais
    //não possui o método sacar
    public void investir(Cliente cliente, double valor){
        if(cliente.getTipoCliente().getNomeTipoCliente().equals("Pessoa Física")){
            //saldo + 2%
        }else{
            //saldo ou saldo + 1%
        }
    }
}
