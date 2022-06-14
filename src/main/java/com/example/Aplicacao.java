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
        //João abre conta corrente
        clienteFisico.abrirConta(clienteFisico, enumTipoDeConta.CONTA_CORRENTE);
        clienteFisico.depositar(clienteFisico, 100);
       
        // System.out.println("Nome: "+clienteFisico.getNome());
        // System.out.println("CPF: "+clienteFisico.getCpf());
        // System.out.println("Estado da Conta: "+clienteFisico.getEstadoConta().getNomeEstadoConta());
        // System.out.println("Tipo de Conta: "+clienteFisico.getTipoDeConta().getNomeTipoDeConta());
        // System.out.println("Saldo: R$ "+clienteFisico.consultarSaldo());
        // System.out.println(clienteFisico.sacar(clienteFisico, 100));
        //Cliente PJ
        // ClientePj clienteJuridico = new ClientePj();
        // clienteJuridico.setNome("Empresa José");
        // clienteJuridico.setCnpj("0000000000000000");
        // clienteJuridico.depositar(clienteJuridico, 1000);

        // clienteFisico.transferir(clienteJuridico, 10);

        // System.out.println();
        // System.out.println(clienteJuridico.getSaldo());
        // System.out.println(clienteFisico.getSaldo());

        // clienteJuridico.depositar(clienteFisico, 100);
        
        ContaInvestimento novoCliente = new ContaInvestimento();
        novoCliente.setTipoCliente(enumTipoCliente.PESSOA_FISICA);
        novoCliente.investir(novoCliente, 150);
        System.out.println();
        System.out.println(novoCliente.getSaldo());

        ContaInvestimento novoClientePj = new ContaInvestimento();
        novoClientePj.setTipoCliente(enumTipoCliente.PESSOA_JURIDICA);
        novoClientePj.investir(novoClientePj, 200);
        System.out.println();
        System.out.println(novoClientePj.getSaldo());
    
        

    }
}
