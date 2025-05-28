
package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    void testeSoma() {
        assertEquals(5, calculadora.soma(2, 3));
    }

    @Test
    void testeSubtracao() {
        assertEquals(1, calculadora.subtrai(5, 4));
    }

    @Test
    void testeMultiplicacao() {
        assertEquals(20, calculadora.multiplica(4, 5));
    }

    @Test
    void testeDivisao() {
        assertEquals(2, calculadora.divide(10, 5));
    }

    @Test
    void testeDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.divide(5, 0));
    }
}
