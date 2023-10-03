package anotherpractice;
import java.util.ArrayList;
import java.util.List;

public class CollectionFrameworkExample {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        List<Integer> numbers = new ArrayList<>();

        // Adding elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Accessing elements
        System.out.println("First Element: " + numbers.get(0)); // Output: 10
        System.out.println("Second Element: " + numbers.get(1)); // Output: 20

        // Updating an element
        numbers.set(1, 25);
        System.out.println("Updated Second Element: " + numbers.get(1)); // Output: 25

        // Removing an element
        numbers.remove(0);
        System.out.println("After Removing First Element: " + numbers); // Output: [25, 30]

        // Checking if the list contains a specific element
        boolean containsTwenty = numbers.contains(20);
        System.out.println("Contains 20: " + containsTwenty); // Output: false

        // Size of the list
        int size = numbers.size();
        System.out.println("Size of the List: " + size); // Output: 2

        // Iterating through the list using for-each loop
        System.out.print("List Elements: ");
        for (int number : numbers) {
            System.out.print(number + " "); // Output: 25 30
        }
    }
}
