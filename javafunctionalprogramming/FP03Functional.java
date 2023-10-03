package javafunctionalprogramming;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP03Functional {
	public static void main(String[] args) {
		List<Integer> numbers = (List.of(1, 23, 34, 32, 45, 43, 34, 22, 11, 23, 34, 45, 1));

		Predicate<Integer> IsEvenpredicate = t -> t % 2 == 0;
		Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {

				return t * t;
			}

		};
		
		Consumer<Integer> consumeRandom=x->System.out.println(x +" forConsumer");
		
		UnaryOperator<Integer> randomUnary=(x)->x*3;
		System.out.println(randomUnary.apply(21) +"For Unary Operator");
		
		BiPredicate<Integer,String> biPredicate=(number ,str)->{
			return number<10 && str.length()>5;
		};
		System.out.println(biPredicate.test(23, "Mahesh Dhimdhime") + " biPredicate");
		
		numbers.stream().filter(IsEvenpredicate).map(squareFunction).forEach(System.out::println);
		
		Supplier<Integer> randomNumber=()->2;
		System.out.println(randomNumber.get());
	}

}
