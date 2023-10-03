package javafunctionalprogramming;

import java.util.List;

public class FP01Functinal {
	public static void main(String[] args) {
		List<Integer> numbers=(List.of(1, 23, 34, 32, 45, 43, 34, 22, 11));
		printEvenNumberInListInFunctional(numbers);
	}
	public static void print(int number) {
		System.out.print(number +" ");
	}
	public static Boolean isEven(int number) {
		return number%2!=0;
	}
	private static void printAllNumberInListInFunctional(List<Integer> numbers) {
		numbers.stream().forEach(FP01Functinal::print);
		
	}
	private static void printEvenNumberInListInFunctional(List<Integer> numbers) {
		numbers
		.stream()
		.filter(FP01Functinal::isEven)
		.forEach(FP01Functinal::print);
		
	}
}
