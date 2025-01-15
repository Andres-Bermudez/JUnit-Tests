package com.platzi;

public class Demo {

    public static String method(String word, int repeat) throws IllegalArgumentException {
        if (repeat < 0) {
            throw new IllegalArgumentException();
        }

        String result = "";
        for (int i = 0; i < repeat; i++) {
            result += word;
        }
        return result;
    }
}
