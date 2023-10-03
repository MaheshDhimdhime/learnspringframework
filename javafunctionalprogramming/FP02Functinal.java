package javafunctionalprogramming;

import java.util.List;

public class FP02Functinal {
	public static void main(String[] args) {

		List<Integer> numbers = (List.of(1, 23, 34, 32, 45, 43, 34, 22, 11,23,34,45,1));
		numbers.stream().distinct().forEach(System.out::println);
		int sum = sumOfAllNumbers(numbers);
		System.out.println(sum);

	}

//	private static int sum(int a, int b) {
//		return a + b;
//	}

	private static int sumOfAllNumbers(List<Integer> numbers) {
		return numbers
				.stream()
				//.reduce(0, FP02Functinal::sum);
				//.reduce(0,Integer::sum);
				.reduce(Integer.MAX_VALUE, (x,y)->x>y?y:x);
				
	}
}
