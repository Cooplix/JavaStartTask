package Restauracja.Spaghetti;

public class SpaghettiLungaFactory extends AbstractSpaghettiFactory {
    @Override
    protected AbstractSpaghetti createInstance(String aName, double aPrice) {
        return new SpaghettiLunga(aName, aPrice);
    }
}
