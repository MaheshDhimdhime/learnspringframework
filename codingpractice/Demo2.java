package codingpractice;

import java.util.Scanner;

class Calculator {
	int num1;
	int num2;

	public int add(int num1, int num2) {

		int r = num1 + num2;
		return r;

	}

	public int subs (int num1, int num2) {

		int r = num1 + num2;
		return r;

	}
}

public class Demo2 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number num1 to add");
		int num1=sc.nextInt();
		System.out.println("Enter number num2 to add");
		int num2=sc.nextInt();
		int r1=cal.add(num1, num2);
		System.out.println("result of r1: "+r1);
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter number num1 to sub");
		int num3=sc1.nextInt();
		System.out.println("Enter number num2 to sub");
		int num4=sc.nextInt();
		int r2=cal.subs(num3, num4);
		System.out.println("result of r1: "+r2);
	}
}
