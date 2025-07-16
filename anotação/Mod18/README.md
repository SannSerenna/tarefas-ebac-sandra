# Módulo 18 - Automatizando Tarefas com Grunt ⚙️

Este diretório contém anotações e/ou exercícios relacionados ao **Grunt**, uma ferramenta de automação de tarefas em projetos front-end, desenvolvidos como parte do curso de Java Backend da EBAC.

## Objetivo

- Compreender o funcionamento do Grunt.
- Automatizar tarefas como minificação, compilação de pré-processadores (LESS/SASS), limpeza de arquivos e monitoramento de alterações.
- Configurar o `Gruntfile.js` com plugins e tarefas personalizadas.

## Estrutura

- `Gruntfile.js`: Arquivo de configuração principal do Grunt.
- `package.json`: Gerencia dependências e scripts do projeto.
- Arquivos de estilo ou HTML para aplicar tarefas automatizadas.
- Possíveis anotações ou exemplos de uso dos plugins.

## Plugins Comuns

- `grunt-contrib-less`: Compila arquivos LESS.
- `grunt-contrib-sass`: Compila arquivos SASS.
- `grunt-contrib-clean`: Limpa diretórios.
- `grunt-contrib-uglify`: Minifica arquivos JavaScript.
- `grunt-contrib-htmlmin`: Minifica arquivos HTML.
- `grunt-contrib-watch`: Monitora alterações em arquivos.
- `grunt-replace`: Realiza substituições em arquivos.
- `grunt-concurrent`: Executa tarefas em paralelo.

## Como Executar

1. Instale o Grunt CLI globalmente:
   ```bash
   npm install -g grunt-cli
