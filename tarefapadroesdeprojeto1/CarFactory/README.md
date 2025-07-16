# CarFactory 🚗 - Padrões de Projeto em Java

Este diretório contém uma aplicação Java desenvolvida como parte das atividades sobre **Padrões de Projeto** no curso de Java Backend da EBAC. O projeto simula uma **fábrica de carros**, aplicando o padrão **Factory Method** para instanciar diferentes tipos de veículos.

## Objetivo

- Demonstrar o uso do padrão de projeto Factory.
- Criar uma estrutura flexível para instanciar objetos sem acoplamento direto.
- Aplicar boas práticas de orientação a objetos.

## Estrutura

- `Car.java`: Interface ou classe abstrata que define o contrato dos carros.
- `Sedan.java`, `SUV.java`, `Hatch.java`: Implementações específicas de tipos de carro.
- `CarFactory.java`: Classe responsável por criar instâncias de carros com base em parâmetros.
- `Main.java`: Classe principal que demonstra o uso da fábrica.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/SannSerenna/tarefas-ebac-sandra.git
