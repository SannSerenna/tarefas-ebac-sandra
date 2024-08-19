package com.example.cadastrocliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroCliente {
    private List<Cliente> clientes;
    private ClienteDAO clienteDAO;

    public CadastroCliente() {
        clienteDAO = new ClienteDAO();
        clientes = clienteDAO.carregarClientes();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        clienteDAO.salvarClientes(clientes);
        System.out.println("Cliente adicionado com sucesso!");
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("Clientes cadastrados:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    public boolean validarEmail(String email) {
        return email.contains("@");
    }

    public boolean validarTelefone(String telefone) {
        return telefone.matches("\\d{10,11}");
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroCliente cadastro = new CadastroCliente();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            if (opcao == 1) {
                System.out.print("Digite o nome do cliente: ");
                String nome = scanner.nextLine();
                System.out.print("Digite o email do cliente: ");
                String email = scanner.nextLine();

                if (!cadastro.validarEmail(email)) {
                    System.out.println("Email inválido. Deve conter '@'.");
                    continue;
                }

                System.out.print("Digite o telefone do cliente (10 ou 11 dígitos): ");
                String telefone = scanner.nextLine();

                if (!cadastro.validarTelefone(telefone)) {
                    System.out.println("Telefone inválido. Deve conter 10 ou 11 dígitos.");
                    continue;
                }

                Cliente cliente = new Cliente(nome, email, telefone);
                cadastro.adicionarCliente(cliente);
            } else if (opcao == 2) {
                cadastro.listarClientes();
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
