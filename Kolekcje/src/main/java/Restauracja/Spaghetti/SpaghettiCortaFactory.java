package Restauracja.Spaghetti;

import Restauracja.Pizza.PizzaThickDough;

public class SpaghettiCortaFactory extends AbstractSpaghettiFactory {

    @Override
    protected AbstractSpaghetti createInstance(String aName, double aPrice) {
        return new SpaghettiCorta(aName, aPrice);
    }
}
