package Restauracja.Spaghetti;

import Restauracja.Pizza.AbstractMenu;

public class SpaghettiMenu extends AbstractMenu<AbstractSpaghetti> {

    private final static String PASTA_LUNGA = "Pasta dluga";
    private final static String PASTA_CORTA = "Pusta krotka";

    public SpaghettiMenu(String aMenuType) {
        AbstractSpaghettiFactory factory = null;
        if (aMenuType.equals(PASTA_LUNGA)) {
            factory = new SpaghettiLungaFactory();
        } else if (aMenuType.equals(PASTA_CORTA)) {
            factory = new SpaghettiCortaFactory();
        }


        add(factory.prepareSpaghetti(AbstractSpaghettiFactory.BOLONESE));
        add(factory.prepareSpaghetti(AbstractSpaghettiFactory.CARBONARA));
    }


    @Override
    protected void showMenuName() {
        System.out.println("PASTA MENU");
        System.out.println("WYBIERZ PASTE:");
    }
}
