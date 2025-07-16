# Tarefa JDBC - EBAC 🔗

Este diretório contém uma aplicação Java que utiliza **JDBC (Java Database Connectivity)** para realizar operações com banco de dados, desenvolvida como parte das atividades do curso de Java Backend da EBAC.

## Objetivo

- Conectar uma aplicação Java a um banco de dados relacional.
- Realizar operações de **CRUD** (Create, Read, Update, Delete).
- Aplicar boas práticas de persistência de dados com JDBC.

## Estrutura

- `Cliente.java`: Classe que representa a entidade cliente.
- `IClienteDAO.java`: Interface que define os métodos de acesso a dados.
- `ClienteDAO.java`: Implementação da interface utilizando JDBC.
- `App.java`: Classe principal que executa a aplicação.

## Tecnologias Utilizadas

- Java 17+
- JDBC
- Banco de dados H2 (ou outro configurado)
- Maven (se aplicável)

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/SannSerenna/tarefas-ebac-sandra.git
