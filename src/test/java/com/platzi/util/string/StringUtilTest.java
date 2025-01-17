package com.platzi.util.string;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    @DisplayName("Probar que un String cualquiera no es vacío")
    void isEmptyWhenLengthIsZero() {
        boolean result = StringUtil.isEmpty("Random String");
        assertFalse(result);
    }

    @Test
    @DisplayName("Probar que “” es un String vacío")
    void isEmptyWhenStringIsEmpty() {
        boolean result = StringUtil.isEmpty("");
        assertTrue(result);
    }

    @Test
    @DisplayName("Probar que null también es un string vacío")
    void isEmptyWhenStringIsNull() {
        boolean result = StringUtil.isEmpty(null);
        assertTrue(result);
    }

    @Test
    @DisplayName("Probar que un String de espacios en blanco: “  ”, también es vacío")
    void isEmptyWhenStringIsContentSpaces() {
        boolean result = StringUtil.isEmpty(" ");
        assertTrue(result);
    }
}