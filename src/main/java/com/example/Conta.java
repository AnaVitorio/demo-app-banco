package com.example;

import com.example.Enums.enumEstadoConta;
import com.example.Enums.enumTipoCliente;
import com.example.Enums.enumTipoDeConta;
import com.example.Interfaces.Funcoes;

public class Conta implements Funcoes {
    private int numeroConta;
    private double saldo;
    private enumEstadoConta estadoConta = enumEstadoConta.FECHADA;
    private enumTipoDeConta tipoDeConta;
    private enumTipoCliente tipoCliente;

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
   
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
    }

    
    @Override
    public void depositar(Conta cliente, double valor) {
        if(valor > 0){
            this.saldo = this.saldo + valor;
        } else{
            System.out.println("Deposite um valor maior que zero.");
        }
        
    }

    //PJ existe a cobrança de uma taxa de 0.5% para cada saque ou transferência
    @Override
    public void transferir(Conta clienteQueRecebe, double valor) {
        if((valor > 0) && (valor <= this.getSaldo())){
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
            System.out.println("Não é possível depositar valor menor ou igual a zero.\nVerifique o saldo da sua conta.");
        }
    }

    @Override
    public double consultarSaldo(){
       return this.getSaldo(); 
    }
    

    public String sacar(Conta cliente, double valor){
        if((valor <= this.saldo && valor > 0) && (this.getTipoDeConta().getNomeTipoDeConta() != "Conta Investimento")){
            if(cliente.getTipoCliente().getNomeTipoCliente().equals("Pessoa Jurídica")){
                double taxa = 0.5;
                double valorTaxa = (valor * taxa)/100;
                this.saldo = this.saldo - (valor + valorTaxa);   
            } else{
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
}
