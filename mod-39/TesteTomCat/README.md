# Teste com Tomcat - Módulo 39 🐱‍💻

Este diretório contém uma aplicação Java simples configurada para ser executada em um **servidor Apache Tomcat**, como parte das atividades do Módulo 39 do curso de Java Backend da EBAC.

## Objetivo

- Criar uma aplicação web básica em Java.
- Configurar e executar a aplicação em um servidor Tomcat.
- Compreender o funcionamento de aplicações Java EE em servidores externos.

## Estrutura

- `index.jsp`: Página inicial da aplicação.
- `web.xml`: Arquivo de configuração do projeto (deployment descriptor).
- `HelloServlet.java`: Servlet que responde a requisições HTTP com uma mensagem simples.
- `build/` ou `target/`: Diretório onde o `.war` pode ser gerado (dependendo da ferramenta usada).

## Como Executar no Tomcat

1. Compile o projeto e gere o arquivo `.war` (via IDE ou Maven).
2. Copie o `.war` para o diretório `webapps` do Tomcat.
3. Inicie o servidor Tomcat.
4. Acesse no navegador:
