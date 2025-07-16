# Módulo 24 - Testes com Mocks e TDD 🧪

Este diretório contém os exercícios do **Módulo 24** do curso de Java Backend da EBAC. O foco está em aplicar os conceitos de **Test Driven Development (TDD)** e o uso de **objetos mock** para simular comportamentos em testes automatizados.

## Objetivo

- Criar testes unitários antes da implementação da lógica.
- Utilizar objetos mock para simular dependências.
- Garantir que o código esteja coberto por testes confiáveis.

## Estrutura

- `Cliente.java`: Classe que representa a entidade cliente.
- `IClienteDAO.java`: Interface para operações de persistência.
- `ClienteDAO.java`: Implementação da interface com lógica de acesso a dados.
- `ClienteService.java`: Classe de serviço que utiliza o DAO.
- `ClienteServiceTest.java`: Classe de testes unitários com uso de mocks.

## Tecnologias Utilizadas

- Java 17+
- JUnit 5
- Mockito
- Maven (se aplicável)

## Como Executar os Testes

1. Clone o repositório:
   ```bash
   git clone https://github.com/SannSerenna/tarefas-ebac-sandra.git
