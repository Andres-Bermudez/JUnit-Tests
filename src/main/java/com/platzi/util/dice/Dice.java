package com.platzi.util.dice;

import java.util.Random;

public class Dice {

    private final int numberSidesOfDice;

    public Dice(int numberSidesOfDice) {
        this.numberSidesOfDice = numberSidesOfDice;
    }

    public int roll() {
        return new Random().nextInt(numberSidesOfDice) + 1;
    }
}
