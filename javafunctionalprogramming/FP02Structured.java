package javafunctionalprogramming;

import java.util.List;

public class FP02Structured {
	public static void main(String[] args) {

		List<Integer> numbers = (List.of(1, 23, 34, 32, 45, 43, 34, 22, 11));
		int sum = sumOfAllNumbers(numbers);
		System.out.println(sum);
	}

	private static int sumOfAllNumbers(List<Integer> numbers) {

		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;

	}
}
