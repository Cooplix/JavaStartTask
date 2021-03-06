package Restauracja.Spaghetti;

import Restauracja.Meal;
import Restauracja.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSpaghetti implements Meal {
    private final String name;
    private final List<Product> products;
    private final double price;
    private final List<Product> additionalProducts;

    public AbstractSpaghetti(String name, double price) {
        this.products = new ArrayList<>();
        this.name = name;
        this.price = price;
        additionalProducts = new ArrayList<>();
    }

    public void addProduct(Product aProduct) {
        products.add(aProduct);
    }

    public void addAdditional(Product aAdditional) {
        additionalProducts.add(aAdditional);
    }

    public String getName() {
        return name;
    }

    public String getProductsAsString() {
        return prepareStringFromArray(products);
    }

    public String getAdditionalsAsString() {
        return prepareStringFromArray(additionalProducts);
    }

    @Override
    public double getPrice() {
        return price + additionalProducts.stream().mapToDouble(Product::getPrice).sum();
    }

    private String prepareStringFromArray(List<Product> additionalProducts) {
        StringBuilder sb = new StringBuilder();
        additionalProducts.stream().forEach(product -> {
            sb.append(product);
            sb.append(", ");
        });
        return sb.toString().isEmpty() ? sb.toString() : sb.toString().substring(0, sb.toString().length() - 2);
    }
}
