package com.platzi.util.discounts;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class PriceCalculatorTest {

    private PriceCalculator priceCalculator;

    @BeforeEach
    public void setup() {
        this.priceCalculator = new PriceCalculator();
    }

    @Test
    @DisplayName("Sin precios agregados")
    void calculatePriceReturn0() {
        assertEquals(0.0, priceCalculator.calculatePrice());
    }

    @Test
    @DisplayName("Sin agregar un descuento")
    void calculatePriceNotAddingDiscount() {
        priceCalculator.addPrice(27500.0);
        priceCalculator.addPrice(45700.0);

        assertEquals(73200.0, priceCalculator.calculatePrice());
    }

    @Test
    @DisplayName("Agregando un descuento al precio")
    void calculatePriceAddingDiscount() {
        priceCalculator.addPrice(20000.0);
        priceCalculator.addPrice(32000.0);
        priceCalculator.addPrice(34000.0);
        priceCalculator.addPrice(14000.0);
        priceCalculator.addDiscount(25);

        assertEquals(75000.0, priceCalculator.calculatePrice());
    }
}