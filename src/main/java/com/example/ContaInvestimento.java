package com.example;

import java.math.BigDecimal;

import com.example.Enums.enumTipoDeConta;

public class ContaInvestimento extends Conta {
    private enumTipoDeConta tipoDeConta = enumTipoDeConta.CONTA_INVESTIMENTO;

    public enumTipoDeConta getTipoDeConta() {
        return tipoDeConta;
    }

    public void consultarInvestimento(){
        if(this.getTipoCliente().getNomeTipoCliente().equals("Pessoa Jurídica")){
            this.setSaldo(this.getSaldo().add(new BigDecimal(2)));
            System.out.printf("R$ %.2f",this.getSaldo());
        }else{
            System.out.printf("R$ %.2f",this.getSaldo());
        }
    }

    public void investir(BigDecimal valor){
        if(!this.getTipoDeConta().getNomeTipoDeConta().equals("Conta Investimento")
        || !(verificaSeContaEstaAberta(this))){
            System.out.println("Para realizar um investimento é preciso informa uma conta do tipo Investimento que esteja aberta.");
        } else{
            if(this.getTipoCliente().getNomeTipoCliente().equals("Pessoa Jurídica")){
                this.setSaldo(this.getSaldo().add(valor.add(new BigDecimal(2)))); 
            }else{
               this.setSaldo(this.getSaldo().add(valor));     
            }

            System.out.printf("Valor: R$ %.2f investido com sucesso.", valor);
        }    
    }

    
}
