package anotherpractice;
import java.util.HashSet;
import java.util.Set;

public class SetImplementationExample {
    public static void main(String[] args) {
        // Create a set to store strings
        Set<String> fruitsSet = new HashSet<>();

        // Adding elements to the set
        fruitsSet.add("Apple");
        fruitsSet.add("Banana");
        fruitsSet.add("Orange");
        fruitsSet.add("Apple"); // Adding duplicate element (ignored in HashSet)

        // Printing the set (order might vary as HashSet is unordered)
        System.out.println("Fruits Set: " + fruitsSet); // Output: [Banana, Orange, Apple]

        // Checking if the set contains an element
        boolean containsBanana = fruitsSet.contains("Banana");
        System.out.println("Contains Banana: " + containsBanana); // Output: true

        // Removing an element from the set
        fruitsSet.remove("Orange");
        System.out.println("After Removing Orange: " + fruitsSet); // Output: [Banana, Apple]

        // Size of the set
        int size = fruitsSet.size();
        System.out.println("Size of the Set: " + size); // Output: 2
    }
}
