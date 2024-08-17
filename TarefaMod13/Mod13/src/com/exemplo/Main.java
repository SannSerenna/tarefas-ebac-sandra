package com.exemplo;

public class Main {
    public static void main(String[] args) {
        // Criando uma Pessoa Física
        com.exemplo.PessoaFisica pf = new com.exemplo.PessoaFisica("João Silva", "Rua A, 123", "99999-9999", "123.456.789-00", "01/01/1990");
        System.out.println("Pessoa Física:\n" + pf);

        // Criando uma Pessoa Jurídica
        com.exemplo.PessoaJuridica pj = new com.exemplo.PessoaJuridica("Empresa X", "Avenida B, 456", "88888-8888", "12.345.678/0001-99", "Empresa X Ltda");
        System.out.println("\nPessoa Jurídica:\n" + pj);
    }
}