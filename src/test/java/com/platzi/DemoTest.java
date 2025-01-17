package com.platzi;

import com.platzi.util.demo.Demo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/*
 * Organizacion de los tests:
 *
 * 1. Crear un test para caso diferente.
 * 2. Nombrar cada test de acuerdo a lo que se esta comprobando.
*/
class DemoTest {

    @Test
    @DisplayName("Repetir palabra 1 vez")
    void testMethodRepeat1() {
        assertEquals("Hello", Demo.method("Hello", 1));
    }

    @Test
    @DisplayName("Repetir palabra 2 veces")
    void testMethodRepeat2() {
        assertEquals("HelloHello", Demo.method("Hello", 2));
    }

    @Test
    @DisplayName("Repetir palabra 3 veces")
    void testMethodRepeat3() {
        assertEquals("HelloHelloHello", Demo.method("Hello", 3));
    }

    @Test
    @DisplayName("Lanzar IlegalArgumentException")
    void testMethodThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Demo.method("Hello", -1);
        });
    }
}
