package Restauracja;

import Restauracja.Drink.Drink;
import Restauracja.Drink.DrinkMenu;

import java.util.Scanner;

public class Main {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Spaghetti");
        System.out.println("2. Pizza");
        System.out.println("3. Napoj");

        int option = sc.nextInt();

        if (option == 1) {
            orderSpaghetii();
        } else if (option == 2) {
            orderPizza();
        } else if (option == 3) {
            orderDrink();
        }
    }

    private static void orderPizza() {

    }

    private static void orderSpaghetii() {
    }

    private static void orderDrink() {
        DrinkMenu drinkMenu = new DrinkMenu();
        drinkMenu.showMenu();
        int opt;
        Drink orderedDrink = null;
        while (orderedDrink == null) {
            opt = sc.nextInt();
            if (opt < 1 || opt > 4) {
                System.out.println("Wybrano niepoprawną opcje");
            } else {
                orderedDrink = (Drink) drinkMenu.get(opt - 1);
            }
        }
        System.out.println("Zamówiłeś napój "+orderedDrink);
        System.out.println("do zapłaty: "+orderedDrink.getPrice());
    }


}
