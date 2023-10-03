package codingpractice;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> arrays = Arrays.asList(1,2,3,4,5,6);
        Optional<Integer> checkNull = Optional.ofNullable(arrays.get(1));

        if (checkNull.isPresent()) {
            System.out.println("The value is: " + checkNull.get());
        } else {
            System.out.println("The value is not present");
        }
    }
}