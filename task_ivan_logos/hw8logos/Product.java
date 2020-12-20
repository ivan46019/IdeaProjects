package task_ivan_logos.hw8logos;

public class Product implements Comparable<Product> {
    private String name;
    private int quantity;
    private double price;
    private double weight;

    public Product(String name, int quantity, double price, int weight) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
    }

    public Product() {
        name = "";
        quantity = 0;
        price = 0.0;
        weight = 0;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }



    @Override
    public String toString() {
        return "Produck " +
                "name - '" + name + '\'' +
                ", quantity - " + quantity +
                ", price - " + price +
                ", weight - " + weight;
    }
    @Override
    public int compareTo(Product o) {
        return 0;
    }
}

