package com.platzi.util.password;

public class Password {

    public static SecurityPassword verifySecurityPassword(String password) {
        // Verificar la longitud de la contrasena.
        if (password == null || password.length() < 8) {
            return SecurityPassword.WEAK;
        }

        // Expresiones regulares.
        boolean hasLetters = password.matches(".*[a-zA-Z].*"); // Letras
        boolean hasDigits = password.matches(".*\\d.*"); // Numeros
        boolean hasSpecial = password.matches(".*[\\W_].*"); // Caracteres especiales.

        // Evaluación de la seguridad de la contrasena.
        // Si la contasena contiene letras, numeros y caracteres especiales.
        if (hasLetters && hasDigits && hasSpecial) {
            return SecurityPassword.STRONG;
          // Si la contrasena contiene (letras y numeros) o (letras y caracteres especiales) o (numeros y caracteres especiales).
        } else if ((hasLetters && hasDigits) || (hasLetters && hasSpecial) || (hasDigits && hasSpecial)) {
            return SecurityPassword.MEDIUM;
        } else {
            return SecurityPassword.WEAK;
        }
    }

    // Niveles de seguridad de una contrasena.
    public enum SecurityPassword {
        WEAK, MEDIUM, STRONG
    }
}
