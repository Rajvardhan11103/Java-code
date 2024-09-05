/* Problem 2: Area Calculation
Description: Create a class AreaCalculator that can calculate the area of different shapes using 
method overloading.
Requirements:
1. Implement a method calculateArea(double radius) to calculate the area of a circle.
2. Implement a method calculateArea(double length, double breadth) to calculate the area of a 
rectangle.
3. Implement a method calculateArea(double base, double height, boolean isTriangle) to calculate the 
area of a triangle  */ 

public class AreaCalculator {

    // Method to calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    // Method to calculate the area of a triangle
    public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
            return -1; // Return -1 if not a triangle
        }
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Calculate and print the area of a circle
        double circleArea = calculator.calculateArea(5.0);
        System.out.println("Area of the circle: " + circleArea);

        // Calculate and print the area of a rectangle
        double rectangleArea = calculator.calculateArea(4.0, 6.0);
        System.out.println("Area of the rectangle: " + rectangleArea);

        // Calculate and print the area of a triangle
        double triangleArea = calculator.calculateArea(3.0, 4.0, true);
        System.out.println("Area of the triangle: " + triangleArea);
    }
}
