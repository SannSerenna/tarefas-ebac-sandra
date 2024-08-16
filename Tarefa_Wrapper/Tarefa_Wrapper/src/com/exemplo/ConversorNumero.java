package com.exemplo;

import java.util.Scanner;

public class ConversorNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo um valor do console
        System.out.print("Digite um número inteiro: ");
        int numeroPrimitivo = scanner.nextInt();

        // Convertendo para o tipo wrapper Integer
        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);

        // Exibindo os valores
        System.out.println("Valor primitivo: " + numeroPrimitivo);
        System.out.println("Valor wrapper: " + numeroWrapper);

        // Fechando o scanner
        scanner.close();
    }
}
