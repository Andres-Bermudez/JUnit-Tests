package com.platzi.util.leapyears;

public class DateLeapYear {
/*
 * Todos los años divisibles por 400, SON años bisiestos (1600, 2000, 2400),
 * Todos los años divisibles por 100, pero no por 400, NO son años bisiestos (1700, 1800, 1900),
 * Todos los años divisibles por 4, pero no por 100, SON años bisiestos (1996, 2004, 2008),
 * Todos los años no divisibles por 4, NO son años bisiestos (2017, 2018, 2019)
 */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
