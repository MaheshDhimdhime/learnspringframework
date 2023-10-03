package codingpractice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

        Stream<String> charStream = 
        		 words
        		.stream()
        		
                .map(word -> word.chars()   // Transform each word into a stream of characters
                .mapToObj(ch -> String.valueOf((char) ch))
                
                .reduce((ch1,ch2)->ch1+" ," +ch2) // Combine characters into a single string
                
                .orElse(""));
        

        charStream.forEach(System.out::println);
        // Output:
        // h, e, l, l, o
        // w, o, r, l, d
        // j, a, v, a
    }
}
