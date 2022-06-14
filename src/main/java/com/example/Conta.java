package com.example;

import com.example.Enums.enumEstadoConta;
import com.example.Enums.enumTipoCliente;
import com.example.Enums.enumTipoDeConta;
import com.example.Interfaces.Funcoes;

public class Conta implements Funcoes {
    private double saldo;
    private enumEstadoConta estadoConta = enumEstadoConta.FECHADA;
    private enumTipoDeConta tipoDeConta;
    private enumTipoCliente tipoCliente;
   
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
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
    public void abrirConta(Conta cliente, enumTipoDeConta tipoDeConta){
        cliente.setTipoDeConta(tipoDeConta);
        cliente.setEstadoConta(enumEstadoConta.ABERTA);
        System.out.println("Conta aberta com sucesso!");
    }

    
    @Override
    public void depositar(Conta cliente, double valor) {
        if(!verificaSeContaEstaAberta(cliente)){
            System.out.println("Sua conta ainda não está aberta!");
        }else{
            if((valor > 0)){
                this.saldo = this.saldo + valor;
            } else{
                System.out.println("Deposite um valor maior que zero.");
            }
        }
    }

    //PJ existe a cobrança de uma taxa de 0.5% para cada saque ou transferência
    @Override
    public void transferir(Conta clienteQueRecebe, double valor) {
        if((valor > 0) 
        && (valor <= this.getSaldo()) 
        && (verificaSeContaEstaAberta(clienteQueRecebe))
        && (verificaSeContaEstaAberta(this))){
            if(this.getTipoCliente().getNomeTipoCliente().equals("Pessoa Jurídica")){
                double taxa = 0.5;
                double valorTaxa = (valor * taxa)/100;
                this.setSaldo(this.getSaldo() - (valor+valorTaxa));
                clienteQueRecebe.setSaldo(clienteQueRecebe.getSaldo() + valor);
                
            }else{
                this.setSaldo(this.getSaldo() - valor);
                clienteQueRecebe.setSaldo(clienteQueRecebe.getSaldo() + valor);
                
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
    public double consultarSaldo(){
       return this.getSaldo(); 
    }
    

    public String sacar(double valor){
        if((valor <= this.saldo && valor > 0) 
        && (this.getTipoDeConta().getNomeTipoDeConta() != "Conta Investimento")
        && (verificaSeContaEstaAberta(this))){
            if(this.getTipoCliente().getNomeTipoCliente().equals("Pessoa Jurídica")){
                double taxa = 0.5;
                double valorTaxa = (valor * taxa)/100;
                this.saldo = this.saldo - (valor + valorTaxa);  
            } else if(verificaSeContaEstaAberta(this)){
                this.saldo = this.saldo - valor;
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
