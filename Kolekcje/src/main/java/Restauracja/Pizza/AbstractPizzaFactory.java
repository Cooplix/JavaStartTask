package Restauracja.Pizza;

import Restauracja.Product;

public abstract class AbstractPizzaFactory {
    public final static String MARGHERITA = "Margherita";
    public final static String MAFIOSO = "Mafioso";

    public AbstarctPizza preparePizza(String aType) {
        switch (aType) {
            case MARGHERITA:
                AbstarctPizza margheritaPizza = createInstance(MARGHERITA, 24.90);
                margheritaPizza.addProduct(Product.MOZZARELLA);
                margheritaPizza.addProduct(Product.TOMATO);
                return margheritaPizza;
            case MAFIOSO:
                AbstarctPizza mafiosoPizza = createInstance(MAFIOSO, 29.99);
                mafiosoPizza.addProduct(Product.BECON);
                mafiosoPizza.addProduct(Product.CHILI);
                mafiosoPizza.addProduct(Product.CHEESE);
                mafiosoPizza.addProduct(Product.OREGANO);
                return mafiosoPizza;
        }
        throw new IllegalArgumentException("I don't know this burger");
    }

    protected abstract AbstarctPizza createInstance(String aName, double aPrice);
}
