/* 14. Product Inventory System:
Write a Java program to create a HashMap of String keys and Product values where the 
keys are product codes and the values are Product objects. Each Product object should 
have properties such as name and quantity. Add five products to the map. Implement 
functionality to update the quantity of a product and display the updated inventory.
*/ 

import java.util.*;

class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Getters and setters for product properties
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", quantity=" + quantity + '}';
    }
}

class ProductInventorySystem {
    public static void main(String[] args) {
        // Create a HashMap to store product codes and Product objects
        HashMap<String, Product> inventory = new HashMap<>();

        // Add five products
        inventory.put("P123", new Product("Widget A", 100));
        inventory.put("P456", new Product("Gizmo B", 50));
        inventory.put("P789", new Product("Thingamajig C", 75));
        inventory.put("P987", new Product("Doodad D", 200));
        inventory.put("P654", new Product("Whatchamacallit E", 30));

        // Update quantity for a product (e.g., increase Widget A quantity)
        String productCodeToUpdate = "P123";
        int newQuantity = 120;
        if (inventory.containsKey(productCodeToUpdate)) {
            Product productToUpdate = inventory.get(productCodeToUpdate);
            productToUpdate.setQuantity(newQuantity);
            System.out.println("Updated inventory:");
            System.out.println(productToUpdate);
        } else {
            System.out.println("Product not found.");
        }
    }
}

