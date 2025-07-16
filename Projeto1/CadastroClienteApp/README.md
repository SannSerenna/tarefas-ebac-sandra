# Projeto 1 - Cadastro de Cliente 🧾

Este diretório contém uma aplicação Java desenvolvida como parte do Projeto 1 do curso de Java Backend da EBAC. O sistema simula um **cadastro de clientes**, com funcionalidades básicas de inserção, consulta, alteração e exclusão.

## Funcionalidades

- Cadastrar cliente com dados como nome, CPF, telefone, endereço, cidade e estado.
- Consultar cliente pelo CPF.
- Alterar dados de um cliente existente.
- Excluir cliente do sistema.
- Interface via terminal com menus interativos.

## Estrutura

- `Cliente.java`: Classe que representa os dados de um cliente.
- `IClienteDAO.java`: Interface para operações de persistência.
- `ClienteMapDAO.java`: Implementação da interface usando `Map` para armazenar os dados.
- `App.java`: Classe principal que gerencia o fluxo da aplicação via `JOptionPane`.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/SannSerenna/tarefas-ebac-sandra.git
