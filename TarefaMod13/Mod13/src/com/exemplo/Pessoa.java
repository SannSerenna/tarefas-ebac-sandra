package com.exemplo;

public abstract class Pessoa {
    protected String nome;
    protected String endereco;
    protected String telefone;

    // Construtor
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método toString para exibir informações comuns
    @Override
    public String toString() {
        return "Nome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone;
    }
}
