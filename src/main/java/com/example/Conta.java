package com.example;

import java.math.BigDecimal;

import com.example.Enums.enumEstadoConta;
import com.example.Enums.enumTipoCliente;
import com.example.Enums.enumTipoDeConta;
import com.example.Interfaces.Funcoes;

public class Conta implements Funcoes {
    private BigDecimal saldo = new BigDecimal(0);
    private enumEstadoConta estadoConta = enumEstadoConta.FECHADA;
    private enumTipoDeConta tipoDeConta;
    private enumTipoCliente tipoCliente;
   
    public BigDecimal getSaldo() {
        return saldo;
    }
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    public enumEstadoConta getEstadoConta() {
        return estadoConta;
    }

    public void setEstadoConta(enumEstadoConta estadoConta) {
        this.estadoConta = estadoConta;
    }

    public enumTipoDeConta getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(enumTipoDeConta enumTipoDeConta) {
        this.tipoDeConta = enumTipoDeConta;
    }

    public enumTipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(enumTipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    
    @Override
    public void abrirConta(Conta cliente, enumTipoDeConta tipoDeConta, enumTipoCliente tipoDeCliente){
        cliente.setTipoDeConta(tipoDeConta);
        cliente.setTipoCliente(tipoDeCliente);
        cliente.setEstadoConta(enumEstadoConta.ABERTA);
        System.out.println("Conta aberta com sucesso!");
    }

    
    @Override
    public void depositar(Conta cliente, BigDecimal valor) {
        if(!verificaSeContaEstaAberta(cliente)){
            System.out.println("Sua conta ainda não está aberta!");
        }else{
            BigDecimal zero = new BigDecimal(0);
            if((valor.compareTo(zero) == 1)){
                cliente.setSaldo(cliente.getSaldo().add(valor));
            } else{
                System.out.println("Deposite um valor maior que zero.");
            }
        }
    }

    @Override
    public void transferir(Conta clienteQueRecebe, BigDecimal valor) {
        if((valor.compareTo(this.saldo) == -1
        || valor.equals(this.saldo)) 
        && (verificaSeContaEstaAberta(clienteQueRecebe))
        && (verificaSeContaEstaAberta(this))){
            if(this.getTipoCliente().getNomeTipoCliente().equals("Pessoa Jurídica")){
                BigDecimal taxa = new BigDecimal(0);
                this.setSaldo(this.getSaldo().subtract((valor.add(valor.multiply(taxa).divide(new BigDecimal(100))))));
                clienteQueRecebe.setSaldo(clienteQueRecebe.getSaldo().add(valor));
                
            }else{
                this.setSaldo(this.getSaldo().subtract(valor));
                clienteQueRecebe.setSaldo(clienteQueRecebe.getSaldo().add(valor));
                
            }
            System.out.printf("Transferência realizada com sucesso.\n"+ 
                "* Valor transferido:R$ %.2f\n * Saldo atual: R$ %.2f", valor,this.getSaldo());
        } else{
            System.out.println("Não foi possível realizar a transferência por um dos motivos a baixo:\n"+
            "*Tentativa de transferência de valor menor ou igual a zero.\n"+
            "*Você não possui saldo suficiente para realizar essa transferência.\n"+
            "*Sua conta está com estado fechada.\n"+
            "*A conta destino da tranferência está com o estado fechada."
            );
        }
    }

    public boolean verificaSeContaEstaAberta(Conta conta){
        if(conta.getEstadoConta().getNomeEstadoConta().equals("Aberta")){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public BigDecimal consultarSaldo(){
       return this.getSaldo(); 
    }
    

    public String sacar(BigDecimal valor){
        if((valor.compareTo(this.saldo) == -1
        ||valor.equals(this.saldo))
        &&(valor.compareTo(new BigDecimal(0)) == 1)
        &&(this.getTipoDeConta().getNomeTipoDeConta() != "Conta Investimento")
        && (verificaSeContaEstaAberta(this))){
            if(this.getTipoCliente().getNomeTipoCliente().equals("Pessoa Jurídica")){
                BigDecimal taxa = new BigDecimal(0.5);
                this.saldo = this.saldo.subtract(valor.add(valor.multiply(taxa).divide(new BigDecimal(100))));  
            } else if(verificaSeContaEstaAberta(this)){
                this.saldo = this.saldo.subtract(valor);
            }

            return "Valor sacado: R$ " + valor + " Saldo Atual: R$ " + this.saldo;

        } else{
            return "Não foi possível realizar o saque, por alguns dos motivos a baixo:\n"+ 
            "* Saldo insuficiente\n"+
            "* Sua conta é do tipo Investimento\n"+
            "* Tentativa de sacar valor negativo";
        }

    }

    @Override
    public String toString() {
        return "Conta [estadoConta=" + this.getEstadoConta().getNomeEstadoConta() + ", saldo=" + saldo
                + ", tipoCliente=" + this.getTipoCliente().getNomeTipoCliente() + 
                ", tipoDeConta=" + this.getTipoDeConta().getNomeTipoDeConta() + "]";
    }
}
