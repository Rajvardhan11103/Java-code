/*  1. Creating and Adding Elements:
Write a Java program to create a HashSet of Double values representing various 
temperatures. Add five different temperatures to the set and display the contents of 
the set. */ 

import java.util.HashSet;
import java.util.Set;

class TemperatureSetExample {
    public static void main(String[] args) {
       
	   
        Set<Double> temperatureSet = new HashSet<>();
		
        temperatureSet.add(25.5); // Celsius
        temperatureSet.add(68.0); // Fahrenheit
        temperatureSet.add(10.0); // Celsius
        temperatureSet.add(-5.0); // Celsius
        temperatureSet.add(98.6); // Fahrenheit

         
        System.out.println("Temperature set contents:");
        for (Double temperature : temperatureSet) {
            System.out.println(temperature);
        }
    }
}
