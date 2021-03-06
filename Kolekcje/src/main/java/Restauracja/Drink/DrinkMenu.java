package Restauracja.Drink;

import Restauracja.Pizza.AbstractMenu;

public class DrinkMenu extends AbstractMenu {

    public DrinkMenu() {
        add(new Drink("Coca-Cola", 3.20));
        add(new Drink("Sprite", 3.20));
        add(new Drink("Fanta", 3.20));
        add(new Drink("Woda", 0.0));
    }

    @Override
    protected void showMenuName() {
        System.out.println("Menu Napojow");
        System.out.println("Wybirz napoj");
    }
}
