package Restauracja.Pizza;

import Restauracja.Pizza.AbstarctPizza;

public class PizzaThickDough extends AbstarctPizza {
    public PizzaThickDough(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return getName() + " na tlustym ciescie " + System.getProperty("line.separator") + getProductsAsString();
    }
}
