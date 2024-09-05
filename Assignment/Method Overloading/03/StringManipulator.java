/*  Problem 3: String Manipulator
Description: Create a StringManipulator class that can perform various string operations using 
method overloading.
Requirements:
1. Implement a method concatenate(String a, String b) to concatenate two strings.
2. Implement a method concatenate(String a, String b, String c) to concatenate three strings.
3. Implement a method concatenate(String[] strings) to concatenate an array of strings  */ 

public class StringManipulator {

    
    public String concatenate(String a, String b) {
        return a + b;
    }

   
    public String concatenate(String a, String b, String c) {
        return a + b + c;
    }

    
    public String concatenate(String[] strings) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            result.append(strings[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
		
        String result1 = manipulator.concatenate("Hello, ", "World!");
        System.out.println("Concatenated two strings: " + result1);

        String result2 = manipulator.concatenate("Java ", "is ", "fun!");
        System.out.println("Concatenated three strings: " + result2);

        String[] stringArray = {"This ", "is ", "an ", "array ", "of ", "strings."};
        String result3 = manipulator.concatenate(stringArray);
        System.out.println("Concatenated array of strings: " + result3);
    }
}
