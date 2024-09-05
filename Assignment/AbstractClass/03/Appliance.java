/* Problem 3: Abstract Appliance
Description: Create an abstract class Appliance to represent different types of home appliances. 
Each appliance should have a method to turn on and turn off.
Requirements:
1. Create an abstract class Appliance with abstract methods turnOn() and turnOff().
2. Create concrete classes WashingMachine, Refrigerator, and Microwave that extend Appliance and
implement the turnOn() and turnOff() methods.
3. Add attributes to each concrete class: WashingMachine should have loadCapacity, Refrigerator
should have volume, and Microwave should have power.
4. Implement a main method to create instances of each appliance and demonstrate turning 
them on and off. */

abstract class Appliance {
    abstract void turnOn();
    abstract void turnOff();
}

class WashingMachine extends Appliance {
    private double loadCapacity;

    public WashingMachine(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    void turnOn() {
        System.out.println("Washing Machine is now ON. Load Capacity: " + loadCapacity + " kg");
    }

    @Override
    void turnOff() {
        System.out.println("Washing Machine is now OFF.");
    }
}

class Refrigerator extends Appliance {
    private double volume;

    public Refrigerator(double volume) {
        this.volume = volume;
    }

    @Override
    void turnOn() {
        System.out.println("Refrigerator is now ON. Volume: " + volume + " liters");
    }

    @Override
    void turnOff() {
        System.out.println("Refrigerator is now OFF.");
    }
}

class Microwave extends Appliance {
    private double power;

    public Microwave(double power) {
        this.power = power;
    }

    @Override
    void turnOn() {
        System.out.println("Microwave is now ON. Power: " + power + " watts");
    }

    @Override
    void turnOff() {
        System.out.println("Microwave is now OFF.");
    }
}

class ApplianceTest {
    public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine(7.5);  
        Appliance refrigerator = new Refrigerator(300);  
        Appliance microwave = new Microwave(800);  

        washingMachine.turnOn();
        washingMachine.turnOff();

        refrigerator.turnOn();
        refrigerator.turnOff();

        microwave.turnOn();
        microwave.turnOff();
    }
}
