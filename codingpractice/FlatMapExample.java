package codingpractice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> nestedLists = Arrays.asList(
            Arrays.asList(1, 2, 3,2,3),
            Arrays.asList(4, 5, 6,6,5),
            Arrays.asList(7, 8, 9,9,7)
        );

        List<Integer> flattenedList = nestedLists
        		.stream()
        		
                .flatMap(List::stream) // Flatten the nested lists into a single stream of elements
                .distinct()
                .collect(Collectors.toList());

        System.out.println(flattenedList); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
