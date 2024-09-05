/* Scenario 3: Text Processing Utility
Problem Statement: You are developing a text processing utility in Java. Implement text 
manipulation logic using a method-local inner class to handle formatting tasks.
Requirements:
1. Text Processing Method:
o Define a method processText in a TextProcessor class that manipulates text such as 
trimming whitespace, converting to uppercase, and counting characters.
2. Method-Local Inner Class:
o Implement a method-local inner class TextManipulator within processText.
o TextManipulator should encapsulate methods to perform tasks like trimming 
whitespace, converting text to uppercase, and counting characters.
3. Testing:
o Instantiate TextProcessor in a main class and call processText with sample text inputs.
o Verify that TextManipulator correctly processes the text and returns results based on 
the specified operations. */ 

class TextProcessor {

    // Method to process text
    public void processText(String inputText) {
        // Instantiate the inner class
        TextManipulator textManipulator = new TextManipulator();

        // Perform operations
        String trimmedText = textManipulator.trimWhitespace(inputText);
        String uppercaseText = textManipulator.convertToUppercase(inputText);
        int charCount = textManipulator.countCharacters(inputText);

        // Display results
        System.out.println("Trimmed text: " + trimmedText);
        System.out.println("Uppercase text: " + uppercaseText);
        System.out.println("Character count: " + charCount);
    }

    // Method-local inner class for text manipulation
    private class TextManipulator {
        public String trimWhitespace(String text) {
            return text.trim();
        }

        public String convertToUppercase(String text) {
            return text.toUpperCase();
        }

        public int countCharacters(String text) {
            return text.length();
        }
    }

    public static void main(String[] args) {
        // Example usage
        TextProcessor textProcessor = new TextProcessor();
        String sampleText = "   Hello, World!   ";
        textProcessor.processText(sampleText);
    }
}
