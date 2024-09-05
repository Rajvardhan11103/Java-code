/* Problem 3: Shape Drawing
Description: Create an interface Drawable to represent different drawable shapes.
Requirements:
1. Create an interface Drawable with a method draw().
2. Implement this interface in classes Circle, Rectangle, and Triangle.
3. Each class should provide its own implementation of the draw() method.
4. Implement a main method to create instances of each shape and demonstrate drawing 
them.
*/
 
interface Drawable {
    void draw();
}

 
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}

 
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}

 
class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle...");
    }
}

 
class ShapeDrawing {
    public static void main(String[] args) {
         
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();
        Drawable triangle = new Triangle();

        
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
