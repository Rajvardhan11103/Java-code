/* 9. Problem Statement: Invalid Temperature Exception
o Define a custom checked exception InvalidTemperatureException. Write a 
program that takes a temperature value as input and throws 
InvalidTemperatureException if the temperature is below absolute zero (-
273.15°C). */ 

import java.util.Scanner;


class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String message) {
        super(message);
    }
}

class TemperatureChecker {
    static void checkTemperature(double temperature) throws InvalidTemperatureException {
        if (temperature < -273.15) {
            throw new InvalidTemperatureException("Temperature cannot be below absolute zero (-273.15°C).");
        } else {
            System.out.println("The temperature is valid: " + temperature + "°C");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in °C: ");
        double temperature = scanner.nextDouble();

        try {
            checkTemperature(temperature);
        } catch (InvalidTemperatureException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
