/* Problem 5: Vehicle Movements
Description: Create a class hierarchy for different types of vehicles, where each vehicle moves 
differently. Use method overriding to achieve polymorphism.
Requirements:
1. Create a base class Vehicle with a method move().
2. Create derived classes Car, Bicycle, and Boat, each overriding the move() method to describe 
their respective movements.
3. Implement a main method to demonstrate calling move() on different vehicle objects stored 
in a Vehicle array. */ 


class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

 
class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is driving on the road");
    }
}

 
class Bicycle extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bicycle is pedaling on the path");
    }
}

 
class Boat extends Vehicle {
    @Override
    public void move() {
        System.out.println("Boat is sailing on the water");
    }
}

 class VehicleMovementDemo {
    public static void main(String[] args) {
         
        Vehicle[] vehicles = {new Car(), new Bicycle(), new Boat()};

         
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
