package codingpractice;

import java.util.Scanner;

class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("wed");
			break;
		case 4:
			System.out.println("Thu");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sat");
			break;
		default:
			System.out.println("Enter Valid Key Number");
			break;
		}
	}
}
