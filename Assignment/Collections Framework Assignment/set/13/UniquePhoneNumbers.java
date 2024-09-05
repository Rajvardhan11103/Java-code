/* 13. Unique Phone Numbers:
Write a Java program to create a TreeSet of String values representing phone numbers. 
Add several phone numbers to the set, including duplicates. Display the phone 
numbers sorted in ascending order.
 */ 
 
import java.util.Set;
import java.util.TreeSet;

class UniquePhoneNumbers {
    public static void main(String[] args) {
        // Create a TreeSet to store phone numbers
        Set<String> phoneNumberSet = new TreeSet<>();

        // Add phone numbers (including duplicates)
        phoneNumberSet.add("+91 9156396969");
        phoneNumberSet.add("+91 9876543210");
        phoneNumberSet.add("+91 8895636982");
        phoneNumberSet.add("+91 8965324897"); // Duplicate
        phoneNumberSet.add("+91 915682365");
        phoneNumberSet.add("+91 9876543210"); // Duplicate

        // Display the sorted phone numbers
        System.out.println("Sorted phone numbers:");
        for (String phoneNumber : phoneNumberSet) {
            System.out.println(phoneNumber);
        }
    }
}
