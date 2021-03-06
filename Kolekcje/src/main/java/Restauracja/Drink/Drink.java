package Restauracja.Drink;

import Restauracja.Meal;

public class Drink implements Meal {
    private final String name;
    private final double price;

    public Drink(String aName, double aPrice) {
        this.name = aName;
        this.price = aPrice;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}
