package Restauracja;

public abstract class AbstractSpaghettiFactory {
    public final static String BOLONESE = "Bolonese";
    public final static String CARBONARA = "Carbonara";

    public AbstractSpaghetti preparePizza(String aType) {
        switch (aType) {
            case BOLONESE:
                AbstractSpaghetti spaghettiBolonese = createInstance(BOLONESE, 24.90);
                spaghettiBolonese.addProduct(Product.MOZZARELLA);
                spaghettiBolonese.addProduct(Product.MEAT);
                return spaghettiBolonese;
            case CARBONARA:
                AbstractSpaghetti spaghettiCarbonara = createInstance(CARBONARA, 29.99);
                spaghettiCarbonara.addProduct(Product.BECON);
                spaghettiCarbonara.addProduct(Product.MOZZARELLA);
                spaghettiCarbonara.addProduct(Product.OREGANO);
                return spaghettiCarbonara;
        }
        throw new IllegalArgumentException("I don't know this burger");
    }
    protected abstract AbstractSpaghetti createInstance(String aName, double aPrice);
}
