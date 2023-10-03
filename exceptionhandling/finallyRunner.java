package exceptionhandling;

import java.util.Scanner;

public class finallyRunner {
	public static void main(String[] args) {
		
		try
		{
			Scanner sc=new Scanner(System.in);
		
		int[] numbers= {1,23,4,5,6};
		int number=numbers[7];
		System.out.println("Before scanner close");
		sc.close();
		}catch (Exception e) {
			//System.exit(1);
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("just before closing main");
	}
}
