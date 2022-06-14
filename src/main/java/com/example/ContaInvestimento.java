package com.example;

public class ContaInvestimento extends Conta {
    //Cliente PJ rende 2% a mais
    //não possui o método sacar
    public void investir(Conta cliente, double valor){
        if(cliente.getTipoCliente().getNomeTipoCliente().equals("Pessoa Física")){
            //saldo + 2%
            // deposita = 100
            //consulta saldo = 102
            //cada consulta aplica mais 2%
            //rendimento 
            cliente.setSaldo(cliente.getSaldo() + (cliente.getSaldo() * 2) /100);
        }else{
           cliente.setSaldo(cliente.getSaldo() + valor);
            
        }
    }
}
