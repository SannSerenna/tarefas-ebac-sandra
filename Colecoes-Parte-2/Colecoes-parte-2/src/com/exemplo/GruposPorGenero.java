package com.exemplo;

import java.util.*;

public class GruposPorGenero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Estruturas para armazenar nomes separados por gênero
        Map<String, List<String>> gruposGenero = new HashMap<>();
        gruposGenero.put("Masculino", new ArrayList<>());
        gruposGenero.put("Feminino", new ArrayList<>());

        // Continuar lendo nomes e sexos até que o usuário decida parar
        while (true) {
            System.out.print("Digite o nome (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine().trim();

            if (nome.equalsIgnoreCase("sair")) {
                break; // Encerra o loop se o usuário digitar "sair"
            }

            System.out.print("Digite o sexo (Masculino/Feminino): ");
            String sexo = scanner.nextLine().trim();

            // Validando o gênero e adicionando ao grupo correspondente
            if (sexo.equalsIgnoreCase("Masculino")) {
                gruposGenero.get("Masculino").add(nome);
            } else if (sexo.equalsIgnoreCase("Feminino")) {
                gruposGenero.get("Feminino").add(nome);
            } else {
                System.out.println("Sexo inválido! Tente novamente.");
            }
        }

        // Ordenando os nomes em cada grupo
        gruposGenero.get("Masculino").sort(String::compareTo);
        gruposGenero.get("Feminino").sort(String::compareTo);

        // Imprimindo os resultados
        System.out.println("\nNomes masculinos ordenados:");
        for (String nome : gruposGenero.get("Masculino")) {
            System.out.println(nome);
        }

        System.out.println("\nNomes femininos ordenados:");
        for (String nome : gruposGenero.get("Feminino")) {
            System.out.println(nome);
        }

        // Fechando o scanner
        scanner.close();
    }
}
