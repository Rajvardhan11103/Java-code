/* 12. Library Book Categories:
Write a Java program to create a LinkedHashSet of String values representing different 
book categories in a library. Add categories such as Fiction, Non-Fiction, Science, 
and History. Display the categories in the order they were added.
 */ 
 
 import java.util.LinkedHashSet;
import java.util.Set;

class BookCategories {
    public static void main(String[] args) {
        // Create a LinkedHashSet to store book categories
        Set<String> categorySet = new LinkedHashSet<>();

        // Add different book categories
        categorySet.add("Fiction");
        categorySet.add("Non-Fiction");
        categorySet.add("Science");
        categorySet.add("History");

        // Display the categories in the order they were added
        System.out.println("Book categories:");
        for (String category : categorySet) {
            System.out.println(category);
        }
    }
}
