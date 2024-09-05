/* 14. Unique Tags for Blog Posts:
Write a Java program to create a HashSet of String values representing tags used in blog 
posts. Add various tags to the set. Compute and display the total number of unique 
tags. */ 

import java.util.HashSet;
import java.util.Set;

class BlogTags {
    public static void main(String[] args) {
        
        Set<String> tagSet = new HashSet<>();

        // Add various tags
        tagSet.add("technology");
        tagSet.add("programming");
        tagSet.add("web development");
        tagSet.add("design");
        tagSet.add("data science");
        tagSet.add("productivity");
        tagSet.add("inspiration");
        tagSet.add("travel");
        tagSet.add("food");
        tagSet.add("health");

         
        int uniqueTagCount = tagSet.size();

         
        System.out.println("Total unique tags: " + uniqueTagCount);
    }
}
