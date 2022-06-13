package com.example;

import com.example.Enums.enumEstadoConta;
import com.example.Enums.enumTipoCliente;
import com.example.Enums.enumTipoDeConta;
import com.example.Interfaces.Funcoes;

public class Conta implements Funcoes {
    private int numeroConta;
    private int agencia;
    private double saldo;
    private enumEstadoConta estadoConta = enumEstadoConta.FECHADA;
    private enumTipoDeConta tipoDeConta;


    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
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

    @Override
    public void abrirConta(String nome, int numeroTipoCliente, int numeroTipoDeConta){
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
    
        if(numeroTipoCliente == 1){
            cliente.setTipoCliente(enumTipoCliente.PESSOA_FISICA);
        } else if(numeroTipoCliente == 2){
            cliente.setTipoCliente(enumTipoCliente.PESSOA_JURIDICA);
        }

        if(numeroTipoDeConta == 1){
            cliente.setTipoDeConta(enumTipoDeConta.CONTA_CONRRENTE);
        } else if(numeroTipoDeConta == 2){
            cliente.setTipoDeConta(enumTipoDeConta.CONTA_POUPANCA);
        } else if(numeroTipoDeConta == 3){
            cliente.setTipoDeConta(enumTipoDeConta.CONTA_INVESTIMENTO);
        }

        cliente.setEstadoConta(enumEstadoConta.ABERTA);

    }

     //PJ existe a cobrança de uma taxa de 0.5% para cada saque ou transferência
    @Override
    public void depositar(Cliente cliente, double valor) {
        if(cliente.getTipoCliente().getNomeTipoCliente().equals("Pessoa Jurídica")){
            double taxa = 0.5;
            double valorTaxa = (valor * taxa)/100;
            this.saldo = this.saldo + valor - valorTaxa;
        } else{
            this.saldo = this.saldo + valor;
        }
        
    }

    @Override
    public void transferir(Cliente cliente, double valor) {
        this.saldo = this.saldo - valor;
        cliente.setSaldo(cliente.getSaldo() + valor);
        
    }

    @Override
    public double consultarSaldo(){
       return this.getSaldo(); 
    }
    

    public String sacar(double valor){
        if((valor <= this.saldo) && (this.getTipoDeConta().getNomeTipoDeConta() != "Conta Investimento")){
            this.saldo = this.saldo - valor;
            return "Valor sacado: " + valor + " Saldo Atual: " + this.saldo;
        } else{
            return "Não foi possível realizar o saque, por alguns dos motivos a baixo:\n"+ 
            "* Saldo insuficiente\n"+
            "* Sua conta é do tipo Investimento";
        }

    }
}
