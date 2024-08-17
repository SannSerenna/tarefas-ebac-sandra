package com.exemplo;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String dataNascimento;

    // Construtor
    public PessoaFisica(String nome, String endereco, String telefone, String cpf, String dataNascimento) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Método toString para exibir informações específicas
    @Override
    public String toString() {
        return super.toString() + "\nCPF: " + cpf + "\nData de Nascimento: " + dataNascimento;
    }
}
