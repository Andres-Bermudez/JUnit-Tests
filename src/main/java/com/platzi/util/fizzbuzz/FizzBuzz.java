package com.platzi.util.fizzbuzz;

public class FizzBuzz {
    /*
     * Usando TDD (empieza por los tests), implementa una función que dado un número:
     *
     * Si el número es divisible por 3, retorna “Fizz”,
     * Si el número es divisible por 5, retorna “Buzz”,
     * Si el número es divisible por 3 y por 5, retorna “FizzBuzz”,
     *
     * En otro caso, retorna el mismo número.
    */
    public static String isFizzOrBuzz(int number) {
        if (number == 0 || number < 0) {
            return String.valueOf(number);
        } else if (number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return "";
    }
}
