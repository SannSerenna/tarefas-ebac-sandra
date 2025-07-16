# Módulo 37 - Spring Boot com Camadas 🧱

Este diretório contém uma aplicação Java desenvolvida como parte do **Módulo 37** do curso de Java Backend da EBAC. O projeto tem como objetivo aplicar a estrutura de **camadas (Controller, Service, Repository)** utilizando **Spring Boot**, promovendo organização e boas práticas no desenvolvimento de APIs REST.

## Objetivo

- Criar uma API REST com estrutura em camadas.
- Separar responsabilidades entre controle, lógica de negócio e persistência.
- Utilizar Spring Boot para facilitar a configuração e execução da aplicação.

## Estrutura

- `controller/`: Define os endpoints da API e recebe as requisições HTTP.
- `service/`: Contém a lógica de negócio e validações.
- `repository/`: Interface para persistência de dados (simulada ou real).
- `model/`: Classes que representam as entidades do sistema.
- `application.properties`: Configurações da aplicação.

## Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Maven
- Postman ou navegador para testes

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/SannSerenna/tarefas-ebac-sandra.git
