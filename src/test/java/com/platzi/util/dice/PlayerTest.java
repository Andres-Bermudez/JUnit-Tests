package com.platzi.util.dice;

import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void looseWhenDiceNumberIsLow() {

        // Hacer un mock de la clase Dice y simular el valor que retorna el metodo roll().
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 3);

        // Ejecutar el test.
        assertEquals(false, player.play());
    }
}
