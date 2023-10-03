package anotherpractice;
public class ThrowExample {
    public static void main(String[] args) {
        try {
            int age = -10;
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
            System.out.println("Age: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
