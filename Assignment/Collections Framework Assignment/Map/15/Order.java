/* 15. Order Management System:
Write a Java program to create a TreeMap of String keys and Order values where the 
keys are order IDs and the values are Order objects. Each Order object should have 
properties such as customerName and totalAmount. Add five orders to the map. 
Implement functionality to find and display all orders with amounts greater than a 
specified value. */ 

import java.util.*;

class Order {
    private String customerName;
    private double totalAmount;

    public Order(String customerName, double totalAmount) {
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    // Getters for order properties
    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}

class OrderManagementSystem {
    public static void main(String[] args) {
        // Create a TreeMap to store order IDs and Order objects
        TreeMap<String, Order> orderMap = new TreeMap<>();

        // Add five orders
        orderMap.put("O123", new Order("Alice", 150.0));
        orderMap.put("O456", new Order("Bob", 200.0));
        orderMap.put("O789", new Order("Carol", 180.0));
        orderMap.put("O987", new Order("David", 250.0));
        orderMap.put("O654", new Order("Eve", 220.0));

        // Specify a minimum amount (e.g., orders greater than $200)
        double specifiedAmount = 200.0;

        // Display orders with amounts greater than the specified value
        System.out.println("Orders with amounts greater than $" + specifiedAmount + ":");
        for (Map.Entry<String, Order> entry : orderMap.entrySet()) {
            Order order = entry.getValue();
            if (order.getTotalAmount() > specifiedAmount) {
                System.out.println(order);
            }
        }
    }
}
