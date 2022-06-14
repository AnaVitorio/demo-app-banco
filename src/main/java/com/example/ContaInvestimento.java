package com.example;

import com.example.Enums.enumTipoDeConta;

public class ContaInvestimento extends Conta {
    //Cliente PJ rende 2% a mais
    //não possui o método sacar
    private enumTipoDeConta tipoDeConta = enumTipoDeConta.CONTA_INVESTIMENTO;
    private double saldo;

    // @Override
    // public double getSaldo() {
    //     return this.saldo + 2;
    // }
    
    // @Override
    // public void setSaldo(double saldo){
    //     this.saldo = this.saldo + (this.saldo*2/100);
    // }

    public enumTipoDeConta getTipoDeConta() {
        return tipoDeConta;
    }
    public void taxa(double saldo){

    }

    public void investir(Conta cliente, double valor){

        if(!cliente.getTipoDeConta().getNomeTipoDeConta().equals("Conta Investimento")){
            System.out.println("Para realizar um investimento é preciso informa uma conta do tipo Investimento.");
        } else{
            if(cliente.getTipoCliente().getNomeTipoCliente().equals("Pessoa Jurídica")){
                cliente.setSaldo(cliente.getSaldo() + (cliente.getSaldo() * 2) /100);
                //saldo + 2%
                //deposita = 100
                //consulta saldo = 102
                //cada consulta aplica mais 2%
                //rendimento 
            }else{
               cliente.setSaldo(cliente.getSaldo() + valor);     
            }

            System.out.printf("Valor: R$ %.2f investido com sucesso.", valor);
        }    
    }
}
