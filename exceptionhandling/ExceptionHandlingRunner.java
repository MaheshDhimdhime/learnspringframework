package exceptionhandling;

public class ExceptionHandlingRunner {
	public static void main(String[] args) {
		method1();
		System.out.println("Main Ended");
	}

	public static void method1() {
		method2();
		System.out.println("method1 ended");
	}

	private static void method2() {
		try {
//			String str = null;
//			System.out.println(str.length());
			System.out.println("method 2 ended");
			int[] i = { 1, 3 };
			int number = i[3];
		} catch (NullPointerException ex) {
			System.out.println("Matched NullPointerException");
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Matched ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		}
	}
}
