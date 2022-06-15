package com.example;

import com.example.Enums.enumTipoDeConta;

public class ContaInvestimento extends Conta {
    private enumTipoDeConta tipoDeConta = enumTipoDeConta.CONTA_INVESTIMENTO;
    private double saldo;

    public enumTipoDeConta getTipoDeConta() {
        return tipoDeConta;
    }

    public void investir(double valor){
        if(!this.getTipoDeConta().getNomeTipoDeConta().equals("Conta Investimento")
        || !(verificaSeContaEstaAberta(this))){
            System.out.println("Para realizar um investimento é preciso informa uma conta do tipo Investimento que esteja aberta.");
        } else{
            if(this.getTipoCliente().getNomeTipoCliente().equals("Pessoa Jurídica")){
                System.out.println(this.getTipoCliente().getNomeTipoCliente());
                this.setSaldo(this.getSaldo() + valor + 2); 
            }else{
               this.setSaldo(this.getSaldo() + valor);     
            }

            System.out.printf("Valor: R$ %.2f investido com sucesso.", valor);
        }    
    }

    // public void investir(double valor){
    //     if(!(this.getTipoDeConta().getNomeTipoDeConta().equals("Conta Investimento"))){
    //         System.out.println("Não é uma conta investimento.");
    //     }else{
    //         this.setSaldo(this.getSaldo() + valor);
    //     }

    // }
    
}
