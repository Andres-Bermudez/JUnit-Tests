package com.platzi.util.password;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

// Tests de la seguridad de una contrasena.
class PasswordTest {

    @Test
    @DisplayName("Menos de 8 caracteres: WEAK")
    void verifySecurityPasswordLength() {
        assertEquals(Password.SecurityPassword.WEAK, Password.verifySecurityPassword("abc123*"));
    }

    @Test
    @DisplayName("Contiene letras: WEAK")
    void verifySecurityPasswordContentLetters() {
        assertEquals(Password.SecurityPassword.WEAK, Password.verifySecurityPassword("abcdefgh"));
    }

    @Test
    @DisplayName("Contiene numeros: WEAK")
    void verifySecurityPasswordContentNumbers() {
        assertEquals(Password.SecurityPassword.WEAK, Password.verifySecurityPassword("12345678"));
    }

    @Test
    @DisplayName("Contiene caracteres especiales: WEAK")
    void verifySecurityPasswordContentSpecialCharacters() {
        assertEquals(Password.SecurityPassword.WEAK, Password.verifySecurityPassword("+*&%#@!?/"));
    }

    @Test
    @DisplayName("Contiene letras y numeros: MEDIUM")
    void verifySecurityPasswordContentLettersAndNumbers() {
        assertEquals(Password.SecurityPassword.MEDIUM, Password.verifySecurityPassword("abcd1234"));
    }

    @Test
    @DisplayName("Contiene letras, numeros y caracteres especiales: STRONG")
    void verifySecurityPasswordContentLettersNumbersAndSpecialCharacters() {
        assertEquals(Password.SecurityPassword.STRONG, Password.verifySecurityPassword("abcd1234*+"));
    }
}