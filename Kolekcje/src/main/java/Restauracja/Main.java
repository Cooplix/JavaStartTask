package Restauracja;

import Restauracja.Drink.Drink;
import Restauracja.Drink.DrinkMenu;
import Restauracja.Pizza.AbstarctPizza;
import Restauracja.Pizza.PizzaMenu;
import Restauracja.Spaghetti.AbstractSpaghetti;
import Restauracja.Spaghetti.SpaghettiMenu;

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
        System.out.println("Wybirz rodzaj ciasta");
        System.out.println("1. Cinkie \n2. Tluste");

        PizzaMenu pizzaMenu = null;
        int roolTypeFromUser = sc.nextInt();
        switch (roolTypeFromUser) {
            case 1:
                pizzaMenu = new PizzaMenu(PizzaMenu.getThinCrust());
                break;
            case 2:
                pizzaMenu = new PizzaMenu(PizzaMenu.getThickDough());
                break;
            default:
                throw new IllegalArgumentException("Wybrano niepoprawną opcje");
        }

        pizzaMenu.showMenu();
        int opt;
        AbstarctPizza orderedPizza = null;
        while (orderedPizza == null) {
            opt = sc.nextInt();
            if (opt < 1 || opt > 3) {
                System.out.println("Wybrano niepoprawną opcje");
            } else {
                orderedPizza = pizzaMenu.get(opt - 1);
            }
        }

        int opt2;
        do{
            System.out.println("Czy życzysz sobie coś do niej dołożyć?");
            System.out.println("1. Zamawiam");
            System.out.println("2. 1.00 " + Product.TOMATO);
            System.out.println("3. 0.40 " + Product.RUCOLA);
            System.out.println("4. 0.80 " + Product.CHEESE);
            System.out.println("5. 1.50 " + Product.BECON);

            opt2 = sc.nextInt();
            switch (opt2) {
                case 1:
                    break;
                case 2:
                    orderedPizza.addAdditional(Product.TOMATO);
                    break;
                case 3:
                    orderedPizza.addAdditional(Product.RUCOLA);
                    break;
                case 4:
                    orderedPizza.addAdditional(Product.CHEESE);
                    break;
                case 5:
                    orderedPizza.addAdditional(Product.BECON);
                    break;
                default:
                    System.out.println("Wybrano niepoprawną opcje");
                    break;
            }

        }while (opt2 !=1);

        System.out.println("Zamówiłeś pizze " + orderedPizza);
        System.out.println("wybrane dodatki to: " + orderedPizza.getAdditionalsAsString());
        System.out.println("do zapłaty: " + orderedPizza.getPrice());

    }

    private static void orderSpaghetii() {
        System.out.println("Wybirz rodzaj pastu");
        System.out.println("1. Dluga \n2. Krotka");

        SpaghettiMenu spaghettiMenu = null;
        int roolTypeFromUser = sc.nextInt();
        switch (roolTypeFromUser) {
            case 1:
                spaghettiMenu = new SpaghettiMenu(SpaghettiMenu.getPastaLunga());
                break;
            case 2:
                spaghettiMenu = new SpaghettiMenu(SpaghettiMenu.getPastaCorta());
                break;
            default:
                throw new IllegalArgumentException("Wybrano niepoprawną opcje");
        }

        spaghettiMenu.showMenu();
        int opt;
        AbstractSpaghetti orderedSpaghetti = null;
        while (orderedSpaghetti == null) {
            opt = sc.nextInt();
            if (opt < 1 || opt > 3) {
                System.out.println("Wybrano niepoprawną opcje");
            } else {
                orderedSpaghetti = spaghettiMenu.get(opt - 1);
            }
        }

        int opt2;
        do{
            System.out.println("Czy życzysz sobie coś do niej dołożyć?");
            System.out.println("1. Zamawiam");
            System.out.println("2. 1.00 " + Product.TOMATO);
            System.out.println("3. 0.40 " + Product.RUCOLA);
            System.out.println("4. 0.80 " + Product.CHEESE);
            System.out.println("5. 1.50 " + Product.BECON);
            System.out.println("6. 1.20 " + Product.JALAPENO);

            opt2 = sc.nextInt();
            switch (opt2) {
                case 1:
                    break;
                case 2:
                    orderedSpaghetti.addAdditional(Product.TOMATO);
                    break;
                case 3:
                    orderedSpaghetti.addAdditional(Product.RUCOLA);
                    break;
                case 4:
                    orderedSpaghetti.addAdditional(Product.CHEESE);
                    break;
                case 5:
                    orderedSpaghetti.addAdditional(Product.BECON);
                    break;
                case 6:
                    orderedSpaghetti.addAdditional(Product.JALAPENO);
                    break;
                default:
                    System.out.println("Wybrano niepoprawną opcje");
                    break;
            }

        }while (opt2 !=1);

        System.out.println("Zamówiłeś spaghetti " + orderedSpaghetti);
        System.out.println("wybrane dodatki to: " + orderedSpaghetti.getAdditionalsAsString());
        System.out.println("do zapłaty: " + orderedSpaghetti.getPrice());
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
