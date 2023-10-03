package codingpractice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapToIntExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java","Mahesh");

        IntStream charStream = words
        		.stream()
                .flatMapToInt(word -> word.chars()); // Flatten the strings into an IntStream of characters
       
        charStream.forEach(System.out::println);
        // Output:
        // 104 (h)
        // 101 (e)
        // 108 (l)
        // 108 (l)
        // 111 (o)
        // 119 (w)
        // 111 (o)
        // 114 (r)
        // 108 (l)
        // 100 (d)
        // 106 (j)
        // 97  (a)
        // 118 (v)
        // 97  (a)
    }
}
