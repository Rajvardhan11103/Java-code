/* Problem 7: Online Store
Description: Create an interface Shippable to represent different types of products that can be 
shipped.
Requirements:
1. Create an interface Shippable with methods calculateShippingCost() and ship().
2. Implement this interface in classes Electronics, Clothing, and Books.
3. Each class should provide its own implementation of the calculateShippingCost() and ship()
methods.
4. Implement a main method to create instances of each product type and demonstrate 
calculating shipping costs and shipping them. */

// Define the Shippable interface
interface Shippable {
    double calculateShippingCost();
    void ship();
}

// Implement the Shippable interface in the Electronics class
class Electronics implements Shippable {
    private double weight;

    public Electronics(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateShippingCost() {
        return weight * 10; // Example calculation based on weight
    }

    @Override
    public void ship() {
        System.out.println("Shipping electronics...");
    }
}

// Implement the Shippable interface in the Clothing class
class Clothing implements Shippable {
    private double weight;

    public Clothing(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateShippingCost() {
        return weight * 5; // Example calculation based on weight
    }

    @Override
    public void ship() {
        System.out.println("Shipping clothing...");
    }
}

// Implement the Shippable interface in the Books class
class Books implements Shippable {
    private double weight;

    public Books(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateShippingCost() {
        return weight * 2; // Example calculation based on weight
    }

    @Override
    public void ship() {
        System.out.println("Shipping books...");
    }
}

// Main class to demonstrate calculating shipping costs and shipping products
class OnlineStore {
    public static void main(String[] args) {
        // Create instances of each product type
        Shippable electronics = new Electronics(2.5); // weight in kg
        Shippable clothing = new Clothing(1.0); // weight in kg
        Shippable books = new Books(3.0); // weight in kg

        // Demonstrate calculating shipping costs and shipping products
        System.out.println("Electronics shipping cost: $" + electronics.calculateShippingCost());
        electronics.ship();

        System.out.println("Clothing shipping cost: $" + clothing.calculateShippingCost());
        clothing.ship();

        System.out.println("Books shipping cost: $" + books.calculateShippingCost());
        books.ship();
    }
}
