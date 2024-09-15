package com.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FiltrarMulheres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listaPessoas = new ArrayList<>();

        // Leitura dos dados
        while (true) {
            System.out.print("Digite o nome e o sexo separados por vírgula (ou 'sair' para encerrar): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            listaPessoas.add(input);
        }

        // Filtrar apenas as mulheres usando Stream e Lambda
        List<String> listaMulheres = listaPessoas.stream()
                .filter(pessoa -> {
                    String[] dados = pessoa.split(",");
                    String sexo = dados[1].trim();
                    return sexo.equalsIgnoreCase("Feminino");
                })
                .map(pessoa -> pessoa.split(",")[0].trim())  // Pegando apenas o nome
                .collect(Collectors.toList());

        // Imprimir a lista de mulheres
        System.out.println("\nLista de mulheres:");
        listaMulheres.forEach(System.out::println);

        scanner.close();
    }
}
