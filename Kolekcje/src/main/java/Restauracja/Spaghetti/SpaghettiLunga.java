package Restauracja.Spaghetti;

public class SpaghettiLunga  extends AbstractSpaghetti{
    public SpaghettiLunga(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return getName() + " Dluga pasta "  + System.getProperty("line.separator") + getProductsAsString();
    }
}
