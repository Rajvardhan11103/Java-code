/* 2. Sorting Products by Price and Name:
o Write a Java program to create a Product class with properties productId, 
productName, and price. Implement two Comparator classes:
1. ByPriceComparator: Sort products by their prices in ascending order.
2. ByNameComparator: Sort products by their names in alphabetical order.
o Create a HashMap with String keys (product codes) and Product values. Add five 
products to the map.
o To display the products sorted by price, convert the map values to a List and sort it 
using the ByPriceComparator.
o To display the products sorted by name, convert the map values to a List and sort 
it using the ByNameComparator */ 

import java.util.*;

class Product {
    private String productId;
    private String productName;
    private double price;

    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Getter methods
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return productName + " (ID: " + productId + ") - $" + price;
    }
}

class ByPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}

class ByNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getProductName().compareTo(p2.getProductName());
    }
}

class ProductSortingExample {
    public static void main(String[] args) {
        Map<String, Product> productMap = new HashMap<>();
        productMap.put("P101", new Product("P101", "Laptop", 899.99));
        productMap.put("P102", new Product("P102", "Book", 19.99));
        productMap.put("P103", new Product("P103", "Headphones", 79.99));
        productMap.put("P104", new Product("P104", "T-shirt", 29.99));
        productMap.put("P105", new Product("P105", "Phone", 699.99));

        List<Product> productsByPrice = new ArrayList<>(productMap.values());
        Collections.sort(productsByPrice, new ByPriceComparator());

        System.out.println("Products sorted by price:");
        for (Product product : productsByPrice) {
            System.out.println(product);
        }

        List<Product> productsByName = new ArrayList<>(productMap.values());
        Collections.sort(productsByName, new ByNameComparator());

        System.out.println("\nProducts sorted by name:");
        for (Product product : productsByName) {
            System.out.println(product);
        }
    }
}
