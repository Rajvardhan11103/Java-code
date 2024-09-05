/* 2. Set
	1. Sorting Products by Price and Category:
		o Write a Java program to create a Product class with properties productId, 
		productName, and price. Implement two Comparator classes:
				1. ByPriceComparator: Sort products by their prices in ascending order.
				2. ByCategoryComparator: Sort products by their categories in 
				alphabetical order.
						o Create a TreeSet of Product objects with a custom comparator to sort products by 
							price. Add five products to the set and display them.
						o Modify the TreeSet to use the ByCategoryComparator and display the products sorted 
							by category

*/

import java.util.*;

class Product {
    private int productId;
    private String productName;
    private double price;
    private String category;

    public Product(int productId, String productName, double price, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
    @Override
    public String toString() {
        return productName + " (ID: " + productId + ") - $" + price + " (" + category + ")";
    }
}

class ByPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}

class ByCategoryComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getCategory().compareTo(p2.getCategory());
    }
}

class ProductSortingExample {
    public static void main(String[] args) {
        Set<Product> productsByPrice = new TreeSet<>(new ByPriceComparator());
        productsByPrice.add(new Product(101, "Laptop", 899.99, "Electronics"));
        productsByPrice.add(new Product(102, "Book", 19.99, "Books"));
        productsByPrice.add(new Product(103, "Headphones", 79.99, "Electronics"));
        productsByPrice.add(new Product(104, "T-shirt", 29.99, "Clothing"));
        productsByPrice.add(new Product(105, "Phone", 699.99, "Electronics"));

        System.out.println("Products sorted by price:");
        for (Product product : productsByPrice) {
            System.out.println(product);
        }

        Set<Product> productsByCategory = new TreeSet<>(new ByCategoryComparator());
        productsByCategory.addAll(productsByPrice); // Reuse the existing products

        System.out.println("\nProducts sorted by category:");
        for (Product product : productsByCategory) {
            System.out.println(product);
        }
    }
}
