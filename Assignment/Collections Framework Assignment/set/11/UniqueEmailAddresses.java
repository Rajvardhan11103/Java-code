/* 11. Unique Email Addresses:
Write a Java program to create a HashSet of String values where each string represents 
an email address. Add several email addresses to the set, including duplicates. 
Display the unique email addresses. */ 
 
 import java.util.HashSet;
import java.util.Set;

class UniqueEmailAddresses {
    public static void main(String[] args) {
        // Create a HashSet to store email addresses
        Set<String> emailSet = new HashSet<>();

        // Add several email addresses (including duplicates)
        emailSet.add("john.doe@example.com");
        emailSet.add("jane.smith@example.com");
        emailSet.add("john.doe@example.com"); // Duplicate
        emailSet.add("alice.green@example.com");
        emailSet.add("jane.smith@example.com"); // Duplicate

        // Display the unique email addresses
        System.out.println("Unique email addresses:");
        for (String email : emailSet) {
            System.out.println(email);
        }
    }
}
