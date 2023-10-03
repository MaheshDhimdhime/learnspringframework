package javafunctionalprogramming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {
	private String name;
	private int reviewScore;
	private String category;
	private int noOfStudent;

	public Course(String name, String category, int reviewScore, int noOfStudent) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudent = noOfStudent;
	}

	@Override
	public String toString() {
		return "FP03CustomClass [name=" + name + ", reviewScore=" + reviewScore + ", category=" + category
				+ ", noOfStudent=" + noOfStudent + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getNoOfStudent() {
		return noOfStudent;
	}

	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}

	public static void main(String[] args) {

	}
}

public class FP03CustomClass {
	public static void main(String[] args) {
		List<Course> courses = List.of(
				new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 71, 20000));
		
		//allMatch,noneMatch,anyMathc
		Predicate<Course> reviewCodeGreaterThan95predicate 
		= course->course.getReviewScore()<10;
		
		System.out.println(courses.stream().allMatch(reviewCodeGreaterThan95predicate));
		
		System.out.println(courses.stream().noneMatch(reviewCodeGreaterThan95predicate));
		
		System.out.println(courses.stream().anyMatch(reviewCodeGreaterThan95predicate));
		
		System.out.println(courses
				.stream()
				.filter(reviewCodeGreaterThan95predicate)
				.mapToInt(Course::getNoOfStudent)
				.max());
		
		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.counting())));
		
		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
				
		System.out.println(courses.stream()
				.collect(Collectors.groupingBy(Course::getCategory,Collectors.mapping(Course::getName, Collectors.toList()))));
		
		Boolean matched=courses.stream().anyMatch(t->t.getReviewScore()>99);
		System.out.println(matched);
	}
	
}
