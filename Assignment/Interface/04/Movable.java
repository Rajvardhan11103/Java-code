/* Problem 4: Vehicle Movements
Description: Create an interface Movable to represent different types of movable objects.
Requirements:
1. Create an interface Movable with methods moveForward() and moveBackward().
2. Implement this interface in classes Car, Bike, and Robot.
3. Each class should provide its own implementation of the moveForward() and moveBackward()
methods.
4. Implement a main method to create instances of each movable object and demonstrate 
their movements  */ 
 
interface Movable {
    void moveForward();
    void moveBackward();
}

 
class Car implements Movable {
    @Override
    public void moveForward() {
        System.out.println("Car is moving forward...");
    }

    @Override
    public void moveBackward() {
        System.out.println("Car is moving backward...");
    }
}

 
class Bike implements Movable {
    @Override
    public void moveForward() {
        System.out.println("Bike is moving forward...");
    }

    @Override
    public void moveBackward() {
        System.out.println("Bike is moving backward...");
    }
}

 
class Robot implements Movable {
    @Override
    public void moveForward() {
        System.out.println("Robot is moving forward...");
    }

    @Override
    public void moveBackward() {
        System.out.println("Robot is moving backward...");
    }
}

 
class VehicleMovements {
    public static void main(String[] args) {
         
        Movable car = new Car();
        Movable bike = new Bike();
        Movable robot = new Robot();

         
        car.moveForward();
        car.moveBackward();

        bike.moveForward();
        bike.moveBackward();

        robot.moveForward();
        robot.moveBackward();
    }
}
