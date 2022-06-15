package com.example;

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
        clienteFisico.depositar(clienteFisico, 100);
        clienteFisico.sacar(25);
        System.out.println(clienteFisico.toString());
       
    
        
        //Cliente PJ
        ClientePj clienteJuridico = new ClientePj();
        clienteJuridico.setNome("Empresa José");
        clienteJuridico.setCnpj("0000000000000000");
        clienteJuridico.abrirConta(clienteJuridico, enumTipoDeConta.CONTA_CORRENTE, enumTipoCliente.PESSOA_JURIDICA);
        clienteJuridico.depositar(clienteJuridico, 1000);
        clienteJuridico.sacar(100);

        System.out.println(clienteJuridico.toString());

        
        // Transferências
        clienteFisico.transferir(clienteJuridico, 10);
        System.out.println();
        clienteJuridico.transferir(clienteFisico, 155);

        clienteJuridico.depositar(clienteFisico, 100);
        
       
        //Criando uma Conta Investimento pessoa física
        System.out.println();
        ContaInvestimento novoCliente = new ContaInvestimento();
        novoCliente.abrirConta(novoCliente, enumTipoDeConta.CONTA_INVESTIMENTO, enumTipoCliente.PESSOA_FISICA);
        novoCliente.investir(150);
        System.out.println();

        //Criando uma Conta Investimento pessoa jurídica
        ContaInvestimento novoClientePj = new ContaInvestimento();
        novoClientePj.abrirConta(novoClientePj, enumTipoDeConta.CONTA_INVESTIMENTO, enumTipoCliente.PESSOA_JURIDICA);
        novoClientePj.investir(200);
    
        System.out.println();
        System.out.println(novoClientePj.getSaldo());
        System.out.println(novoClientePj.toString());

        
        ClientePf maria = new ClientePf();
        ClientePf joao = new ClientePf();
        maria.abrirConta(maria, enumTipoDeConta.CONTA_CORRENTE,enumTipoCliente.PESSOA_JURIDICA );
        joao.abrirConta(joao, enumTipoDeConta.CONTA_CORRENTE, enumTipoCliente.PESSOA_FISICA);
        maria.depositar(maria, 100);
        maria.transferir(joao, 50);
        System.out.println(maria.getSaldo());
        System.out.println(joao.getSaldo());
        System.out.println(maria.sacar(80));
        System.out.println(maria.consultarSaldo()); 
        
        

    }
}
