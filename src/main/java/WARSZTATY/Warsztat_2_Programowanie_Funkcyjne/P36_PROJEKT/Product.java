package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private final String id;
    private final String name;
    private final Category category;
    private final Money price;
    // konstruktory, gettery itp

    public Product(String id, String name, Category category, Money price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product(" + name + ": " +
                "id(" + id + ')' +
                " category(" + category +
                ") price(" + price +
                ')';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public Money getPrice() {
        return price;
    }

    @Override
    public int compareTo(final Product o) {
        int thisNumber = Integer.parseInt(id.substring(7));
        int otherNumber = Integer.parseInt(o.id.substring(7));
        return thisNumber - otherNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public enum Category {
        HOBBY,
        CLOTHES,
        GARDEN,
        AUTOMOTIVE
    }
}