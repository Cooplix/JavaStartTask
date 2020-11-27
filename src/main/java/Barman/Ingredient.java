package Barman;

public class Ingredient {
    private String name;
    private double amount;

    public Ingredient(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }


}
