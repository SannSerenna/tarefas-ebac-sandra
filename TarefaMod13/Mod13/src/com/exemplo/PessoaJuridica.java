package com.exemplo;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;

    // Construtor
    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String razaoSocial) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    // Getters e Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    // Método toString para exibir informações específicas
    @Override
    public String toString() {
        return super.toString() + "\nCNPJ: " + cnpj + "\nRazão Social: " + razaoSocial;
    }
}

