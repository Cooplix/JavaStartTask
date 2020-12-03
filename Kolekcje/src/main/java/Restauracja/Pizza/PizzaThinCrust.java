package Restauracja.Pizza;

public class PizzaThinCrust extends AbstarctPizza {
    public PizzaThinCrust(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return getName() + " na cienkim ciescie " + System.getProperty("line.separator") + getProductsAsString();
    }
}
