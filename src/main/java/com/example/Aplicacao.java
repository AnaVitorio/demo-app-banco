package com.example;

import com.example.Enums.enumTipoCliente;
import com.example.Enums.enumTipoDeConta;

public class Aplicacao 
{
    public static void main( String[] args )
    {

        // Cliente PF
        // ClientePf clienteFisico = new ClientePf();
        // clienteFisico.setNome("João");
        // clienteFisico.setCpf("111.111.111.11");
        // clienteFisico.abrirConta(clienteFisico, enumTipoDeConta.CONTA_CORRENTE);
        // clienteFisico.depositar(clienteFisico, 100);
        // clienteFisico.sacar(clienteFisico, 25);
        //System.out.println(clienteFisico.toString());
       
    
        //Cliente PJ
        // ClientePj clienteJuridico = new ClientePj();
        // clienteJuridico.setNome("Empresa José");
        // clienteJuridico.setCnpj("0000000000000000");
        // clienteJuridico.abrirConta(clienteJuridico, enumTipoDeConta.CONTA_CORRENTE);
        // clienteJuridico.depositar(clienteJuridico, 1000);
        // clienteJuridico.sacar(clienteJuridico, 100);

        //System.out.println(clienteJuridico.toString());

        // Transferências
        // clienteFisico.transferir(clienteJuridico, 10);
        // clienteJuridico.transferir(clienteFisico, 155);

        // System.out.println();
        // System.out.println(clienteJuridico.getSaldo());
        // System.out.println(clienteFisico.getSaldo());

        // clienteJuridico.depositar(clienteFisico, 100);
        
        //Criando uma Conta Investimento pessoa física
        // System.out.println();
        // ContaInvestimento novoCliente = new ContaInvestimento();
        // novoCliente.setTipoCliente(enumTipoCliente.PESSOA_FISICA);
        // novoCliente.investir(novoCliente, 150);
        // System.out.println();
        // System.out.println(novoCliente.getSaldo());

        //Criando uma Conta Investimento pessoa jurídica
        // ContaInvestimento novoClientePj = new ContaInvestimento();
        // novoClientePj.setTipoCliente(enumTipoCliente.PESSOA_JURIDICA);
        // novoClientePj.investir(novoClientePj, 200);
        // System.out.println();
        // System.out.println(novoClientePj.getSaldo());
        // System.out.println(novoClientePj.toString());

        ClientePf ana = new ClientePf();
        ClientePf lucas = new ClientePf();
        ana.abrirConta(ana, enumTipoDeConta.CONTA_CORRENTE);
        //lucas.abrirConta(lucas, enumTipoDeConta.CONTA_CORRENTE);
        ana.depositar(ana, 100);
        ana.transferir(lucas, 50);
        System.out.println(ana.getSaldo());
        System.out.println(lucas.getSaldo());
        ana.sacar(80);
        System.out.println(ana.consultarSaldo()); 
        
        

    }
}
