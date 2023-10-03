package introductiontoopps;

import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1 :");
		int number1 = sc.nextInt();
		System.out.println("the entered number is " + number1);

		System.out.print("Enter Number 2 :");
		int number2 = sc.nextInt();
		System.out.println("the entered number is " + number2);

		System.out.println("Enter Choices available");
		System.out.println("1-Add");
		System.out.println("2-Subs");
		System.out.println("3-Divide");
		System.out.println("4-Multy");

		System.out.println("Enter Choice");
		int choice = sc.nextInt();

		System.out.println("Your Choices are");
		System.out.println("Number 1 " + number1);
		System.out.println("Number 2 " + number2);
		System.out.println("Choice" + choice);

		performOperation(number1, number2, choice);
	}

	private static void performOperation(int number1, int number2, int choice) {
		switch (choice) {
		case 1:
			System.out.println("Result " + (number1 + number2));
			break;
		case 2:
			System.out.println("Result " + (number1 - number2));
			break;
		case 3:
			System.out.println("Result " + (number1 / number2));
			break;
		case 4:
			System.out.println("Result " + (number1 * number2));
			break;
			default:
				System.out.println("invalid operation");
		}
	}
}
