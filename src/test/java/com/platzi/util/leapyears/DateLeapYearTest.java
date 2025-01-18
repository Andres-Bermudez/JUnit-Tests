package com.platzi.util.leapyears;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class DateLeapYearTest {
/*
 * Todos los años divisibles por 400, SON años bisiestos (1600, 2000, 2400),
 * Todos los años divisibles por 100, pero no por 400, NO son años bisiestos (1700, 1800, 1900),
 * Todos los años divisibles por 4, pero no por 100, SON años bisiestos (1996, 2004, 2008),
 * Todos los años no divisibles por 4, NO son años bisiestos (2017, 2018, 2019)
 */
    @Test
    @DisplayName("Todos los años divisibles por 400, SON años bisiestos (1600, 2000, 2400)")
    void isDivisibleFor400ReturnTrue() {
        assertTrue(DateLeapYear.isLeapYear(1600));
        assertTrue(DateLeapYear.isLeapYear(2000));
        assertTrue(DateLeapYear.isLeapYear(2400));
    }

    @Test
    @DisplayName("Todos los años divisibles por 100, pero no por 400, NO son años bisiestos (1700, 1800, 1900)")
    void isDivisibleFor100ButNotDivisibleFor400ReturnFalse() {
        assertFalse(DateLeapYear.isLeapYear(1700));
        assertFalse(DateLeapYear.isLeapYear(1800));
        assertFalse(DateLeapYear.isLeapYear(1900));
    }

    @Test
    @DisplayName("Todos los años divisibles por 4, pero no por 100, SON años bisiestos (1996, 2004, 2008)")
    void isDivisibleFor4ButNotDivisibleFor100ReturnTrue() {
        assertTrue(DateLeapYear.isLeapYear(1996));
        assertTrue(DateLeapYear.isLeapYear(2004));
        assertTrue(DateLeapYear.isLeapYear(2008));
    }

    @Test
    @DisplayName("Todos los años no divisibles por 4, NO son años bisiestos (2017, 2018, 2019)")
    void isNotDivisibleFor4ReturnFalse() {
        assertFalse(DateLeapYear.isLeapYear(2017));
        assertFalse(DateLeapYear.isLeapYear(2018));
        assertFalse(DateLeapYear.isLeapYear(2019));
    }
}