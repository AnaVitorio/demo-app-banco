package com.example;

import com.example.Enums.enumTipoDeConta;

public class Aplicacao 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ClientePf clienteFisico = new ClientePf();
        clienteFisico.abrirConta(clienteFisico);
        clienteFisico.depositar(clienteFisico, 100);
        clienteFisico.setTipoDeConta(enumTipoDeConta.CONTA_CONRRENTE);
       
        System.out.println(clienteFisico.consultarSaldo());
        System.out.println(clienteFisico.sacar(50));
    }
}
