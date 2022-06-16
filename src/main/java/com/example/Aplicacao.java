package com.example;

import java.math.BigDecimal;

import com.example.Enums.enumTipoCliente;
import com.example.Enums.enumTipoDeConta;

public class Aplicacao 
{
    public static void main( String[] args )
    {

        
        // Cliente PF
        ClientePf clienteFisico = new ClientePf();
        clienteFisico.setNome("João");
        clienteFisico.setCpf("111.111.111.11");
        clienteFisico.abrirConta(clienteFisico, enumTipoDeConta.CONTA_CORRENTE, enumTipoCliente.PESSOA_FISICA);
        clienteFisico.depositar(clienteFisico, new BigDecimal(100));
        clienteFisico.sacar(new BigDecimal(25));
        System.out.println(clienteFisico.toString());
       
    
        
        //Cliente PJ
        ClientePj clienteJuridico = new ClientePj();
        clienteJuridico.setNome("Empresa José");
        clienteJuridico.setCnpj("0000000000000000");
        clienteJuridico.abrirConta(clienteJuridico, enumTipoDeConta.CONTA_CORRENTE, enumTipoCliente.PESSOA_JURIDICA);
        clienteJuridico.depositar(clienteJuridico, new BigDecimal(1000));
        clienteJuridico.sacar(new BigDecimal(100));

        System.out.println(clienteJuridico.toString());

        
        // Transferências
        clienteFisico.transferir(clienteJuridico, new BigDecimal(10));
        System.out.println();
        System.out.println();
        System.out.printf("Saldo Cliente Físico: R$ %.2f\n",clienteFisico.getSaldo());
        System.out.printf("Saldo Cliente Jurídico: R$ %.2f\n",clienteJuridico.getSaldo());
        System.out.println();
        clienteJuridico.transferir(clienteFisico, new BigDecimal(155));
        System.out.println();
        System.out.printf("Saldo Cliente Físico: R$ %.2f\n",clienteFisico.getSaldo());
        System.out.printf("Saldo Cliente Jurídico: R$ %.2f\n",clienteJuridico.getSaldo());

        
        
       
        //Criando uma Conta Investimento pessoa física
        System.out.println();
        ContaInvestimento novoCliente = new ContaInvestimento();
        novoCliente.abrirConta(novoCliente, enumTipoDeConta.CONTA_INVESTIMENTO, enumTipoCliente.PESSOA_FISICA);
        novoCliente.investir(new BigDecimal(150));
        System.out.println();
        novoCliente.consultarInvestimento();
        System.out.println();

        //Criando uma Conta Investimento pessoa jurídica
        ContaInvestimento novoClientePj = new ContaInvestimento();
        novoClientePj.abrirConta(novoClientePj, enumTipoDeConta.CONTA_INVESTIMENTO, enumTipoCliente.PESSOA_JURIDICA);
        novoClientePj.investir(new BigDecimal(200));
    
        System.out.println();
        System.out.println(novoClientePj.toString());

        
        //Concultando o Investimento do cliente PJ
        novoClientePj.consultarInvestimento();
        System.out.println();
        novoClientePj.consultarInvestimento();
        System.out.println();
        novoClientePj.consultarInvestimento();
        System.out.println();
        System.out.println(novoClientePj.toString());


        
        ClientePf maria = new ClientePf();
        ClientePf joao = new ClientePf();
        maria.abrirConta(maria, enumTipoDeConta.CONTA_CORRENTE,enumTipoCliente.PESSOA_JURIDICA );
        joao.abrirConta(joao, enumTipoDeConta.CONTA_CORRENTE, enumTipoCliente.PESSOA_FISICA);
        maria.depositar(maria, new BigDecimal(100));
        maria.transferir(joao, new BigDecimal(50));
        System.out.println();
        System.out.printf("Saldo de Maria: R$ %.2f",maria.getSaldo());
        System.out.println();
        System.out.printf("Saldo de João: R$ %.2f",joao.getSaldo());
        System.out.println();
        System.out.println(maria.sacar(new BigDecimal(80)));
        
        
        

    }
}
