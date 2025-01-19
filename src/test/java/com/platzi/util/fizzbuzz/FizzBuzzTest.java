package com.platzi.util.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    /*
     * Usando TDD (empieza por los tests), implementa una función que dado un número:
     *
     * Si el número es divisible por 3, retorna “Fizz”,
     * Si el número es divisible por 5, retorna “Buzz”,
     * Si el número es divisible por 3 y por 5, retorna “FizzBuzz”,
     *
     * En otro caso, retorna el mismo número.
    */
    @Test
    @DisplayName("Si el numero es 0: Retorna '0'")
    void isFizzOrBuzzWhenNumberIs0() {
        assertEquals("0", FizzBuzz.isFizzOrBuzz(0));
    }

    @Test
    @DisplayName("Si el numero es menor a 0: Retorna 'numero ingresado'")
    void isFizzOrBuzzWhenNumberIsMinor0() {
        assertEquals("-45", FizzBuzz.isFizzOrBuzz(-45));
        assertEquals("-12", FizzBuzz.isFizzOrBuzz(-12));
        assertEquals("-178", FizzBuzz.isFizzOrBuzz(-178));
    }

    @Test
    @DisplayName("Si el número es divisible por 3, retorna “Fizz”")
    void isFizzOrBuzzWhenNumberIsDivisibleFor3() {
        assertEquals("Fizz", FizzBuzz.isFizzOrBuzz(6));
        assertEquals("Fizz", FizzBuzz.isFizzOrBuzz(9));
        assertEquals("Fizz", FizzBuzz.isFizzOrBuzz(12));
    }

    @Test
    @DisplayName("Si el número es divisible por 5, retorna “Buzz”")
    void isFizzOrBuzzWhenNumberIsDivisibleFor5() {
        assertEquals("Buzz", FizzBuzz.isFizzOrBuzz(5));
        assertEquals("Buzz", FizzBuzz.isFizzOrBuzz(10));
        assertEquals("Buzz", FizzBuzz.isFizzOrBuzz(20));
    }

    @Test
    @DisplayName("Si el número es divisible por 3 y por 5, retorna “FizzBuzz”")
    void isFizzOrBuzzWhenNumberIsDivisibleFor3And5() {
        assertEquals("FizzBuzz", FizzBuzz.isFizzOrBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.isFizzOrBuzz(30));
        assertEquals("FizzBuzz", FizzBuzz.isFizzOrBuzz(45));
    }
}