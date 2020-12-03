package Restauracja.Spaghetti;

public class SpaghettiCorta extends AbstractSpaghetti {
    public SpaghettiCorta(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return getName() + " Krotka pasta " + System.getProperty("line.separator") + getProductsAsString();
    }
}
