/* Scenario 2: Simple Calculator Operations
Problem Statement: You are developing a simple calculator program in Java. Implement basic 
arithmetic operations using a method-local inner class to handle calculation logic.
Requirements:
1. Calculator Method:
o Define a method performOperation in a Calculator class that performs addition, 
subtraction, multiplication, and division.
2. Method-Local Inner Class:
o Implement a method-local inner class OperationHandler within performOperation.
o OperationHandler should encapsulate methods to perform each arithmetic operation 
(addition, subtraction, multiplication, division).
3. Testing:
o Instantiate Calculator in a main class and call performOperation with operands and 
operations.
o Verify that OperationHandler correctly performs arithmetic operations and returns 
results based on the provided inputs.*/ 

class Calculator {

    // Method to perform arithmetic operations
    public double performOperation(double operand1, double operand2, char operator) {
        // Instantiate the inner class
        OperationHandler operationHandler = new OperationHandler();

        switch (operator) {
            case '+':
                return operationHandler.add(operand1, operand2);
            case '-':
                return operationHandler.subtract(operand1, operand2);
            case '*':
                return operationHandler.multiply(operand1, operand2);
            case '/':
                return operationHandler.divide(operand1, operand2);
            default:
                System.out.println("Invalid operator!");
                return Double.NaN;
        }
    }

    // Method-local inner class for arithmetic operations
    private class OperationHandler {
        public double add(double a, double b) {
            return a + b;
        }

        public double subtract(double a, double b) {
            return a - b;
        }

        public double multiply(double a, double b) {
            return a * b;
        }

        public double divide(double a, double b) {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Division by zero!");
                return Double.NaN;
            }
        }
    }

    public static void main(String[] args) {
        // Example usage
        Calculator calculator = new Calculator();
        double result = calculator.performOperation(10, 5, '+'); // Change operands and operator as needed
        System.out.println("Result: " + result);
    }
}
