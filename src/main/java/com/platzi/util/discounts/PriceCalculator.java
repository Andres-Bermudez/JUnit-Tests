package com.platzi.util.discounts;

import java.util.List;
import java.util.ArrayList;

public class PriceCalculator {

    private double total = 0.0;
    private int discount = 0;
    private final List<Double> prices = new ArrayList<>();

    public double calculatePrice() {
        prices.forEach(price -> {
            total += price;
        });
        return total = total - (total * ((double) discount / 100));
    }

    public void addPrice(double newPrice) {
        prices.add(newPrice);
    }

    public void addDiscount(int discount) {
        this.discount = discount;
    }
}
