/* Problem 3: Drawing Shapes
Description: Create a class hierarchy for different shapes, where each shape has a different way 
of drawing itself. Use method overriding to achieve polymorphism.
Requirements:
1. Create a base class Shape with a method draw().
2. Create derived classes Circle, Rectangle, and Triangle, each overriding the draw() method to 
draw the respective shape.
3. Implement a main method to demonstrate calling draw() on different shape objects stored 
in a Shape array.
 */
 
 
 
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

 
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

 
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}


class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

class ShapeDrawingDemo {
    public static void main(String[] args) {
         
        Shape[] shapes = {new Circle(), new Rectangle(), new Triangle()};

         
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

