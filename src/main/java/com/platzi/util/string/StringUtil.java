package com.platzi.util.string;

public class StringUtil {

    public static boolean isEmpty(String str) {
        // Verificar si un String es null o contiene 0 caracteres.
        if (str == null || str.length() == 0) {
            return true;
        }

        // Verificar si un String es unicamente de espacios en blanco.
        char[] array = str.toCharArray();
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ') {
                // En caso de que algun caracter sea diferente a un espacio en blanco,
                // entonces la str no es vacia.
                counter += 1;
            }
        }
        // Si la variable counter sigue siendo 0 despues de iterar sobre la str,
        // quiere decir que la str es vacia.
        if (counter == 0) {
            return true;
        }

        return false;
    }
}
