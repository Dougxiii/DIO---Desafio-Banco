package com.java;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Conta contaCorrente = new Conta();
        Conta contaPoupanca = new Conta();
        Conta contaInvestimento = new Conta();

        System.out.println("nome: ");
        contaCorrente.cliente.nome = leitor.nextLine();
        System.out.println("numero: ");
        contaCorrente.numero = leitor.nextInt() ;
        System.out.println("saldo: R$");
        contaCorrente.saldo = leitor.nextDouble();
        System.out.println("idade: ");
        contaCorrente.cliente.idade = leitor.nextByte();

        contaPoupanca.numero = 22;
        contaPoupanca.saldo = 30;
        contaPoupanca.cliente.nome = "fulano";
        contaPoupanca.cliente.idade = 65;

        contaInvestimento.numero = 33;
        contaInvestimento.saldo = 40;
        contaInvestimento.cliente.nome = "Ciclano";
        contaInvestimento.cliente.idade = 32;

        System.out.println("Nome; " + contaCorrente.cliente.nome);
        System.out.println("Conta: " + contaCorrente.numero);
        System.out.println("Saldo: R$" + contaCorrente.saldo);



    }
}
