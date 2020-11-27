package Barman;

public class Main {
    public static void main(String[] args) {
        Barman barman = new Barman();
        Drink drink = barman.createDrink("Sok ananasowy", 100, "Likier malibu", 50, "Mleko kokosowe", 100);
        Barman.printDrink(drink);
    }

}
