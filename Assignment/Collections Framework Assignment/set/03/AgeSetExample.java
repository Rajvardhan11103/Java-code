/* 3. Checking Existence:
Write a Java program to create a TreeSet of Integer values representing ages of people 
in a group. Add five ages to the set. Check if a specific age is present in the set and 
display the result. */ 

import java.util.TreeSet;

class AgeSetExample {
    public static void main(String[] args) {
         
        TreeSet<Integer> ageSet = new TreeSet<>();

        
        ageSet.add(25);
        ageSet.add(30);
        ageSet.add(22);
        ageSet.add(40);
        ageSet.add(28);

         
        int targetAge = 30;
        boolean isPresent = ageSet.contains(targetAge);

        
        if (isPresent) {
            System.out.println("Age " + targetAge + " is present in the set.");
        } else {
            System.out.println("Age " + targetAge + " is not present in the set.");
        }
    }
}
