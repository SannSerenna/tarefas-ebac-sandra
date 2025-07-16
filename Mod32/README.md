# Módulo 32 - Banco de Dados 🗃️

Este diretório contém os exercícios práticos do **Módulo 32** do curso de Java Backend da EBAC. O foco está em aplicar conceitos de **banco de dados relacionais e não relacionais**, com consultas SQL e NoSQL.

## Objetivo

- Praticar comandos SQL para manipulação e consulta de dados.
- Utilizar MongoDB para realizar operações NoSQL.
- Compreender as diferenças entre modelos de dados estruturados e flexíveis.

## Estrutura

- `SQL/`: Contém arquivos `.sql` com consultas e manipulações em banco relacional.
- `NoSQL/`: Contém arquivos `.nosql` ou `.json` com exemplos de consultas em MongoDB.
- `database/`: Pode incluir arquivos de dados como `books.json` para importação no MongoDB.

## Como Executar

### SQL

1. Utilize um SGBD como MySQL ou PostgreSQL.
2. Importe os arquivos `.sql` no seu banco de dados.
3. Execute os comandos para visualizar os resultados.

### NoSQL (MongoDB)

1. Instale o MongoDB localmente ou use um serviço online.
2. Importe os dados:
   ```bash
   mongoimport --db livros --collection books --jsonArray --file books.json
