package com.example;

public class ContaInvestimento extends Conta {
    //Cliente PJ rende 2% a mais
    //não possui o método sacar
    public void investir(Cliente cliente, double valor){
        if(cliente.getTipoCliente().getNomeTipoCliente().equals("Pessoa Física")){
            //saldo + 2%
            // deposita = 100
            //consulta saldo = 102
            // cada consulta aplica mais 2%
            //rendimento 
        }else{
            //saldo
           cliente.setSaldo(cliente.getSaldo() + valor);
            
        }
    }
}
