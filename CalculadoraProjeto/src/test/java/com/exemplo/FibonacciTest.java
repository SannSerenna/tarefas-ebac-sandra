
package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    Fibonacci fibonacci = new Fibonacci();

    @Test
    void testeFibonacciPosicao0() {
        assertEquals(0, fibonacci.calcular(0));
    }

    @Test
    void testeFibonacciPosicao1() {
        assertEquals(1, fibonacci.calcular(1));
    }

    @Test
    void testeFibonacciPosicao6() {
        assertEquals(8, fibonacci.calcular(6));
    }

    @Test
    void testeFibonacciPosicao10() {
        assertEquals(55, fibonacci.calcular(10));
    }
}
