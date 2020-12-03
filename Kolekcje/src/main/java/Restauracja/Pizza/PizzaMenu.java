package Restauracja.Pizza;

import Restauracja.Pizza.*;

public class PizzaMenu extends AbstractMenu<AbstarctPizza> {
    private final static String THICK_DOUGH = "Ciasto tluste";
    private final static String THIN_CRUST = "Ciasto cienkie";

    public PizzaMenu(String aMenuType) {
        AbstractPizzaFactory factory = null;
        if (aMenuType.equals(THICK_DOUGH)) {
            factory = new ThickDoughFactory();
        } else if (aMenuType.equals(THIN_CRUST)) {
            factory = new ThinCrustFactory();
        }


        add(factory.preparePizza(AbstractPizzaFactory.MARGHERITA));
        add(factory.preparePizza(AbstractPizzaFactory.MAFIOSO));
    }


    @Override
    protected void showMenuName() {
        System.out.println("PIZZA MENU");
        System.out.println("WYBIERZ PIZZE:");
    }
}
