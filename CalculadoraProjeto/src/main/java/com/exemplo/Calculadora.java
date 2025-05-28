
package com.exemplo;

/**
 * Classe que representa uma calculadora simples.
 */
public class Calculadora {

    private int adicionar(int a, int b) {
        return a + b;
    }

    private int subtrair(int a, int b) {
        return a - b;
    }

    private int multiplicar(int a, int b) {
        return a * b;
    }

    private int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public int soma(int a, int b) {
        return adicionar(a, b);
    }

    public int subtrai(int a, int b) {
        return subtrair(a, b);
    }

    public int multiplica(int a, int b) {
        return multiplicar(a, b);
    }

    public int divide(int a, int b) {
        return dividir(a, b);
    }
}
