package com.exemplo;

import java.util.*;

public class OrdenaNomesGenero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo uma linha de input com nomes e sexos separados por vírgula
        System.out.print("Digite os nomes e sexos (ex: João-Masculino,Maria-Feminino,Carlos-Masculino): ");
        String input = scanner.nextLine();

        // Separando os nomes e sexos
        String[] nomesESexos = input.split(",");

        // Estruturas para armazenar nomes separados por gênero
        Map<String, List<String>> gruposGenero = new HashMap<>();
        gruposGenero.put("Masculino", new ArrayList<>());
        gruposGenero.put("Feminino", new ArrayList<>());

        // Processando cada par nome-sexo
        for (String nomeESexo : nomesESexos) {
            String[] partes = nomeESexo.split("-");
            String nome = partes[0].trim();
            String genero = partes[1].trim();

            // Adicionando o nome ao grupo de gênero correspondente
            gruposGenero.get(genero).add(nome);
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
