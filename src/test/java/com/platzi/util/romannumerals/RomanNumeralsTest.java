package com.platzi.util.romannumerals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    private RomanNumerals romanNumerals;

    @BeforeEach
    public void setup() {
        this.romanNumerals = new RomanNumerals();
    }

    @Test
    @DisplayName("Convertir numero 1 en su respectivo numero romano")
    void arabicToRomanConvertNumber1() {
        assertEquals("I", romanNumerals.arabicToRoman(1));
    }

    @Test
    @DisplayName("Convertir numero 2 en su respectivo numero romano")
    void arabicToRomanConvertNumber2() {
        assertEquals("II", romanNumerals.arabicToRoman(2));
    }

    @Test
    @DisplayName("Convertir numero 3 en su respectivo numero romano")
    void arabicToRomanConvertNumber3() {
        assertEquals("III", romanNumerals.arabicToRoman(3));
    }

    @Test
    @DisplayName("Convertir numero 4 en su respectivo numero romano")
    void arabicToRomanConvertNumber4() {
        assertEquals("IV", romanNumerals.arabicToRoman(4));
    }

    @Test
    @DisplayName("Convertir numero 5 en su respectivo numero romano")
    void arabicToRomanConvertNumber5() {
        assertEquals("V", romanNumerals.arabicToRoman(5));
    }

    @Test
    @DisplayName("Convertir numero 6 en su respectivo numero romano")
    void arabicToRomanConvertNumber6() {
        assertEquals("VI", romanNumerals.arabicToRoman(6));
    }

    @Test
    @DisplayName("Convertir numero 7 en su respectivo numero romano")
    void arabicToRomanConvertNumber7() {
        assertEquals("VII", romanNumerals.arabicToRoman(7));
    }

    @Test
    @DisplayName("Convertir numero 10 en su respectivo numero romano")
    void arabicToRomanConvertNumber10() {
        assertEquals("X", romanNumerals.arabicToRoman(10));
    }

    @Test
    @DisplayName("Convertir numero 11 en su respectivo numero romano")
    void arabicToRomanConvertNumber11() {
        assertEquals("XI", romanNumerals.arabicToRoman(11));
    }

    @Test
    @DisplayName("Convertir numero 15 en su respectivo numero romano")
    void arabicToRomanConvertNumber15() {
        assertEquals("XV", romanNumerals.arabicToRoman(15));
    }

    @Test
    @DisplayName("Convertir numero 16 en su respectivo numero romano")
    void arabicToRomanConvertNumber16() {
        assertEquals("XVI", romanNumerals.arabicToRoman(16));
    }

    @Test
    @DisplayName("Convertir numero 50 en su respectivo numero romano")
    void arabicToRomanConvertNumber50() {
        assertEquals("L", romanNumerals.arabicToRoman(50));
    }

    @Test
    @DisplayName("Convertir numero 54 en su respectivo numero romano")
    void arabicToRomanConvertNumber54() {
        assertEquals("LIV", romanNumerals.arabicToRoman(54));
    }
}
