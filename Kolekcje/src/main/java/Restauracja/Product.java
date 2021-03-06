package Restauracja;

public enum  Product {
    MEAT("mięso", 1.5),
    SALAT("sałata", 0.8),
    TOMATO("pomidor", 1.0),
    SAUCE("sos", 0.8),
    ONION("cebula", 0.3),
    CUCUMBER("ogórek", 0.7),
    BAMBOO("bambus", 1.3),
    PINEAPPLE("ananas", 1.6),
    CHILI("chili", 0.2),
    OREGANO("oregano", 0.3),
    CHEESE("ser", 0.8),
    JALAPENO("jalapeño", 1.2),
    EGG("jajko", 1.0),
    BECON("bekon", 1.5),
    RUCOLA("rukola", 0.4),
    MOZZARELLA("mozzarela", 0.7);

    private final String name;
    private final double price;

    Product(String aProduct, double aPrice) {
        this.name = aProduct;
        this.price = aPrice;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}
