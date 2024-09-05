/*  Problem 4: Volume Calculation
Description: Create a VolumeCalculator class that can calculate the volume of different 3D shapes 
using method overloading.
Requirements:
1. Implement a method calculateVolume(double radius) to calculate the volume of a sphere.
2. Implement a method calculateVolume(double radius, double height) to calculate the volume of a 
cylinder.
3. Implement a method calculateVolume(double length, double breadth, double height) to calculate the 
volume of a cuboid  */

public class VolumeCalculator {

     
    public double calculateVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

     
    public double calculateVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

     
    public double calculateVolume(double length, double breadth, double height) {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        VolumeCalculator calculator = new VolumeCalculator();

         
        double sphereVolume = calculator.calculateVolume(5.0);
        System.out.println("Volume of the sphere: " + sphereVolume);

         
        double cylinderVolume = calculator.calculateVolume(3.0, 7.0);
        System.out.println("Volume of the cylinder: " + cylinderVolume);

       
        double cuboidVolume = calculator.calculateVolume(4.0, 5.0, 6.0);
        System.out.println("Volume of the cuboid: " + cuboidVolume);
    }
}
