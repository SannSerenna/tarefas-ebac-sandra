# Memelândia - Microservices Edition 🎭

Este diretório contém uma versão refatorada do projeto **Memelândia**, originalmente monolítico, agora dividido em **microserviços** como parte das atividades do curso de Java Backend da EBAC. O objetivo é aplicar os princípios da arquitetura de microsserviços, promovendo escalabilidade, modularidade e manutenção eficiente.

## Microserviços

O sistema foi dividido em dois serviços principais:

- `usuario-service`: Gerencia os dados dos usuários.
- `meme-service`: Gerencia categorias de memes e os próprios memes.

## Tecnologias Utilizadas

- Java com Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- OpenFeign (para comunicação entre serviços)
- Postman (para testes de API)

## Endpoints Principais

### Usuário

- `GET /usuarios`: Lista todos os usuários
- `POST /usuarios`: Cadastra um novo usuário

### Categoria de Meme

- `GET /categoria-meme`: Lista todas as categorias
- `POST /categoria-meme`: Cadastra uma nova categoria

### Meme

- `GET /meme`: Lista todos os memes
- `POST /meme`: Cadastra um novo meme

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/SannSerenna/tarefas-ebac-sandra.git
