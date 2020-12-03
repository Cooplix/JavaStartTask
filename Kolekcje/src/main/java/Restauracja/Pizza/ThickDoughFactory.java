package Restauracja.Pizza;

public class ThickDoughFactory extends AbstractPizzaFactory {

    @Override
    protected AbstarctPizza createInstance(String aName, double aPrice) {
        return new PizzaThickDough(aName, aPrice);
    }
}
