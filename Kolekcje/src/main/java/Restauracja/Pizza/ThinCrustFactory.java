package Restauracja.Pizza;

public class ThinCrustFactory extends AbstractPizzaFactory {


    @Override
    protected AbstarctPizza createInstance(String aName, double aPrice) {
        return new PizzaThinCrust(aName, aPrice);
    }
}