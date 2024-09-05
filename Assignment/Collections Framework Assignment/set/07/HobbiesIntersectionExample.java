/* 7. Set Intersection:
Write a Java program to create two TreeSet objects containing String values 
representing different hobbies. The first set should include five hobbies, and the 
second set should include another set of hobbies (some of which are shared). 
Compute and display the intersection of these two sets.
*/ 

import java.util.Set;
import java.util.TreeSet;

class HobbiesIntersectionExample {
    public static void main(String[] args) {
        // Create the first TreeSet with some hobbies
        Set<String> firstHobbies = new TreeSet<>();
        firstHobbies.add("Reading");
        firstHobbies.add("Hiking");
        firstHobbies.add("Cooking");
        firstHobbies.add("Photography");
        firstHobbies.add("Painting");

        // Create the second TreeSet with additional hobbies (including shared ones)
        Set<String> secondHobbies = new TreeSet<>();
        secondHobbies.add("Cooking");
        secondHobbies.add("Photography");
        secondHobbies.add("Gardening");
        secondHobbies.add("Swimming");

        // Compute the intersection (shared hobbies) of the two sets
        Set<String> intersection = new TreeSet<>(firstHobbies);
        intersection.retainAll(secondHobbies);
		//retainAll() This method retains only the elements that exist in both the intersection set and the secondHobbies set.

        // Display the shared hobbies
        System.out.println("Shared hobbies (intersection):");
        for (String hobby : intersection) {
            System.out.println(hobby);
        }
    }
}
