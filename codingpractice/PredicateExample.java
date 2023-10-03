package codingpractice;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Create a predicate to test for even numbers
        Predicate<Integer> isEven = number -> number % 2 == 2;

        // Filter the list using the predicate
        numbers.stream()
               .filter(isEven)
               .forEach(System.out::println);
    }
}
