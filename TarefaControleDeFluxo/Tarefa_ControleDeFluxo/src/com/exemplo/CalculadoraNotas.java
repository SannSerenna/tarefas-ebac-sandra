package com.exemplo;

import java.util.Scanner;

public class CalculadoraNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo as 4 notas do aluno
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        // Calculando a média
        double media = soma / 4;

        // Condição para verificar aprovação, recuperação ou reprovação
        if (media >= 7) {
            System.out.println("Aprovado com média: " + media);
        } else if (media >= 5) {
            System.out.println("Em recuperação com média: " + media);
        } else {
            System.out.println("Reprovado com média: " + media);
        }

        // Fechando o scanner
        scanner.close();
    }
}
