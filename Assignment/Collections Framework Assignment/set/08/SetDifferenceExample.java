/* 8. Set Difference:
Write a Java program to create two HashSet objects containing Integer values. The first 
set should include numbers from 1 to 10, and the second set should include numbers 
from 5 to 15. Compute and display the difference between these two sets (elements in 
the first set but not in the second).
 */ 
 import java.util.HashSet;
import java.util.Set;

class SetDifferenceExample {
    public static void main(String[] args) {
        // Create the first HashSet with numbers from 1 to 10
        Set<Integer> firstSet = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            firstSet.add(i);
        }

        // Create the second HashSet with numbers from 5 to 15
        Set<Integer> secondSet = new HashSet<>();
        for (int i = 5; i <= 15; i++) {
            secondSet.add(i);
        }

        // Compute the difference (elements in the first set but not in the second)
        Set<Integer> difference = new HashSet<>(firstSet);
        difference.removeAll(secondSet);

        // Display the difference
        System.out.println("Difference between the sets:");
        for (Integer num : difference) {
            System.out.print(num + " ");
        }
    }
}

 