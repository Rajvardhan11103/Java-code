/* Problem 1: Animal Sounds
Description: Create a class hierarchy for different animals, where each animal makes a different 
sound. Use method overriding to achieve polymorphism.
Requirements:
1. Create a base class Animal with a method makeSound().
2. Create derived classes Dog, Cat, and Cow, each overriding the makeSound() method to 
produce their respective sounds.
3. Implement a main method to demonstrate calling makeSound() on different animal objects 
stored in an Animal array */

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}
class AnimalSoundDemo {
    public static void main(String[] args) {
       
        Animal[] animals = {new Dog(), new Cat(), new Cow()};

        // Call makeSound() on each animal
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
