/* Problem 1: Abstract Shape
Description: Create an abstract class Shape to represent different geometric shapes. Each shape 
should be able to calculate its area.
Requirements:
1. Create an abstract class Shape with an abstract method calculateArea().
2. Create concrete classes Circle, Rectangle, and Triangle that extend Shape and implement the 
calculateArea() method.
3. Add attributes to each concrete class: Circle should have radius, Rectangle should have length
and width, and Triangle should have base and height.
4. Implement a main method to create instances of each shape and display their areas.
 */
 
 abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}
class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 7);

        System.out.printf("Circle Area: %.2f%n", circle.calculateArea());
        System.out.printf("Rectangle Area: %.2f%n", rectangle.calculateArea());
        System.out.printf("Triangle Area: %.2f%n", triangle.calculateArea());
    }
}


