package javafunctionalprogramming;

import java.util.List;

public class FP01Exercises {
	public static void main(String[] args) {
		List<Integer> numbers = (List.of(1, 23, 34, 32, 45, 43, 34, 22, 11));
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");

		numbers
		.stream()
		.filter(number -> number % 2 != 0)
		.map(t->t*t*t)
		.forEach(System.out::println);
         
		// courses.stream().forEach(System.out::println);

		// courses.stream().filter(course
		// ->course.contains("Spring")).forEach(System.out::println);

		courses
		.stream()
		.filter(t -> t.length() >= 4)
		.map(t ->t +" : " +t.length())
		.forEach(System.out::println);
	}
}
