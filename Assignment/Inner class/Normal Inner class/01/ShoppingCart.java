/* Scenario 1: Online Shopping Cart
Problem Statement: You are tasked with implementing an online shopping cart system in Java. 
Each shopping cart has items that can be added, removed, and updated. Each item has properties 
such as name, price, and quantity. Implement the shopping cart using an outer class for the cart 
itself and an inner class for managing items.
Requirements:
1. ShoppingCart Class (Outer Class):
o Maintain a list of items in the shopping cart.
o Provide methods to add an item, remove an item by name, update quantity of an 
item, and calculate the total price of items in the cart.
2. Item Class (Inner Class):
o Define an inner class Item within ShoppingCart to represent each item in the cart.
o Each Item should have properties like name, price, and quantity.
o Implement methods in Item class to get and set these properties.
3. Testing:
o Create instances of ShoppingCart in a main class.
o Use methods of ShoppingCart to add items, update quantities, and calculate total 
price.
o Demonstrate the use of inner class Item by accessing and modifying item 
properties.
 */ 
 
 
 import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
     List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    // Add an item to the cart
    public void addItem(String name, double price, int quantity) {
        Item newItem = new Item(name, price, quantity);
        items.add(newItem);
    }

    // Remove an item by name
    public void removeItem(String name) {
        items.removeIf(item -> item.getName().equals(name));
    }

    // Update quantity of an item
    public void updateQuantity(String name, int newQuantity) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                item.setQuantity(newQuantity);
                break;
            }
        }
    }

    // Calculate total price of items in the cart
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice = totalPrice +item.getPrice() * item.getQuantity();
        }
        return totalPrice;
    }

    // Inner class representing an item
    private class Item {
        private String name;
        private double price;
        private int quantity;

        public Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem("Shirt", 25.0, 2);
        cart.addItem("Jeans", 40.0, 1);

        // Update quantity
        cart.updateQuantity("Shirt", 3);

        // Calculate total price
        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total Price: $" + totalPrice);
    }
}
