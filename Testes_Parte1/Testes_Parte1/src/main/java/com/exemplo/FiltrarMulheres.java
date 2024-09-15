package com.exemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FiltrarMulheresTest {

    @Test
    public void testFiltrarMulheres() {
        // Simular a lista de entradas com nome e sexo
        List<String> listaPessoas = new ArrayList<>();
        listaPessoas.add("João,Masculino");
        listaPessoas.add("Maria,Feminino");
        listaPessoas.add("Carlos,Masculino");
        listaPessoas.add("Ana,Feminino");

        // Filtrar apenas as mulheres usando Stream e Lambda
        List<String> listaMulheres = listaPessoas.stream()
                .filter(pessoa -> {
                    String[] dados = pessoa.split(",");
                    String sexo = dados[1].trim();
                    return sexo.equalsIgnoreCase("Feminino");
                })
                .map(pessoa -> pessoa.split(",")[0].trim())  // Pegando apenas o nome
                .collect(Collectors.toList());

        // Verificar se a lista contém apenas os nomes femininos
        List<String> mulheresEsperadas = List.of("Maria", "Ana");
        Assertions.assertEquals(mulheresEsperadas, listaMulheres);
    }
}
