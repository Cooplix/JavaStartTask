package Restauracja.Pizza;

import Restauracja.Meal;

import java.util.ArrayList;

public abstract class AbstractMenu <T extends Meal> extends ArrayList<T> {
    public void showMenu() {
        showMenuName();
        for(int i = 0; i <size(); i++) {
            System.out.println();
            System.out.println(i + 1 + ". " + get(i).getPrice() + " " + get(i));
        }
    }

    protected abstract void showMenuName();
}
