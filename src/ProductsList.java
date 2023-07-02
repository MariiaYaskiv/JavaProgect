import java.util.ArrayList;
import java.util.List;

public class ProductsList {
    public static void printAllProducts(List<Product> products) {
        System.out.println("All products:");
        products.forEach(System.out::println);
    }

    public static void printProductsByColor(List<Product> products, String color) {
        System.out.println("Products with color " + color + ":");
        products.stream()
                .filter(product -> product.getColor().equals(color))
                .forEach(System.out::println);
    }

    public static void printProductsAbovePrice(List<Product> products, double price) {
        System.out.println("Products with price more than " + price + ":");
        products.stream()
                .filter(product -> product.getPrice() > price)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", "Red", 10.99));
        products.add(new Product("Product 2", "Blue", 19.99));
        products.add(new Product("Product 3", "Green", 15.49));
        products.add(new Product("Product 4", "Red", 8.99));
        products.add(new Product("Product 5", "Yellow", 25.99));

        printAllProducts(products);
        System.out.println();
        printProductsByColor(products, "Red");
        System.out.println();
        printProductsAbovePrice(products, 15.0);
    }
}

class Product {
    private String name;
    private String color;
    private double price;

    public Product(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}