/* Scenario 1: Temperature Converter Utility
Problem Statement: You are developing a temperature conversion utility in Java. Implement 
temperature conversion logic using a method-local inner class to encapsulate the conversion 
formulas.
Requirements:
	1. Conversion Method:
		o Define a method convertTemperature in a TemperatureConverter class that converts 
		temperatures between Celsius and Fahrenheit.
	2. Method-Local Inner Class:
		o Implement a method-local inner class Converter within convertTemperature.
		o Converter should encapsulate methods to convert Celsius to Fahrenheit and vice 
		versa using the formulas:
			 Celsius to Fahrenheit: F=95×C+32F = \frac{9}{5} \times C + 32F=59
				×C+32
			 Fahrenheit to Celsius: C=59×(F−32)C = \frac{5}{9} \times (F - 32)C=95
				×(F−32)
	3. Testing:
		o Instantiate TemperatureConverter in a main class and call convertTemperature with 
		sample temperatures.
		o Verify that Converter correctly converts temperatures between Celsius and 
		Fahrenheit based on the provided values. */ 


class TemperatureConverter {

    // Method to convert temperatures
    public void convertTemperature(double celsius) {
        // Instantiate the inner class
        Converter converter = new Converter();

        // Convert Celsius to Fahrenheit
        double fahrenheit = converter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        // Convert Fahrenheit to Celsius
        double convertedCelsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F = " + convertedCelsius + "°C");
    }

    // Method-local inner class for temperature conversion
    private class Converter {
        public double celsiusToFahrenheit(double celsius) {
            return (9.0 / 5.0) * celsius + 32;
        }

        public double fahrenheitToCelsius(double fahrenheit) {
            return (5.0 / 9.0) * (fahrenheit - 32);
        }
    }

    public static void main(String[] args) {
        // Example usage
        TemperatureConverter tempConverter = new TemperatureConverter();
        tempConverter.convertTemperature(25); // Replace with your sample temperature
    }
}
