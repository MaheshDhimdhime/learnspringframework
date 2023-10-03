package anotherpractice;
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 10;

        try {
            int result = divideNumbers(new DivideNumbersParameter(numerator, denominator));
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }

    public static int divideNumbers(DivideNumbersParameter parameterObject) {
        return parameterObject.numerator / parameterObject.denominator;
    }
}
