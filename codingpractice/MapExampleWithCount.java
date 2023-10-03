package codingpractice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapExampleWithCount {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

        Stream<String> charStream = words.stream()
                .map(word -> {
                    String charString = word.chars()
                            .mapToObj(ch -> String.valueOf((char) ch))
                            .reduce((ch1, ch2) -> ch1 + ", " + ch2)
                            .orElse("");
                    return word + " (" + charString + " - " + word.length() + ")";
                });

        charStream.forEach(System.out::println);
        // Output:
        // hello (h, e, l, l, o - 5)
        // world (w, o, r, l, d - 5)
        // java (j, a, v, a - 4)
    }
}
