package anotherpractice;
import java.util.Arrays;
import java.util.List;

public class Java8FeaturesExample {
    public static void main(String[] args) {
        // Creating a list of integerss
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using lambda expression to perform an operation on each element of the list
        numbers.forEach(number -> System.out.println("Square numbers :"+number * 2 + " "));

        // Using lambda expression to filter elements based on a condition
        numbers.stream()
               .filter(number -> number % 2 == 0)
               .forEach(number -> System.out.print(number + " "));
    }
}
