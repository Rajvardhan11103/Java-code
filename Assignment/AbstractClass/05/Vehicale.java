/* Problem 5: Abstract Vehicle
Description: Create an abstract class Vehicle to represent different types of vehicles. Each vehicle 
should have methods to start and stop.
Requirements:
1. Create an abstract class Vehicle with abstract methods start() and stop().
2. Create concrete classes Car, Bike, and Truck that extend Vehicle and implement the start()
and stop() methods.
3. Add attributes to each concrete class: Car should have numberOfDoors, Bike should have 
engineCapacity, and Truck should have loadCapacity.
4. Implement a main method to create instances of each vehicle type and demonstrate 
starting and stopping them. */ 

abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void start() {
        System.out.println("Car with " + numberOfDoors + " doors is starting.");
    }

    @Override
    void stop() {
        System.out.println("Car with " + numberOfDoors + " doors is stopping.");
    }
}

class Bike extends Vehicle {
    private int engineCapacity;

    public Bike(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    void start() {
        System.out.println("Bike with engine capacity of " + engineCapacity + "cc is starting.");
    }

    @Override
    void stop() {
        System.out.println("Bike with engine capacity of " + engineCapacity + "cc is stopping.");
    }
}

class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    void start() {
        System.out.println("Truck with load capacity of " + loadCapacity + " tons is starting.");
    }

    @Override
    void stop() {
        System.out.println("Truck with load capacity of " + loadCapacity + " tons is stopping.");
    }
}

class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car(4); 
        Vehicle bike = new Bike(150);  
        Vehicle truck = new Truck(10);  

        car.start();
        car.stop();

        bike.start();
        bike.stop();

        truck.start();
        truck.stop();
    }
}
