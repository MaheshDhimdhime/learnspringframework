package exceptionhandling;

public class CheckedExceptionRunner {
	public static void main(String[] args) {
		try {
			someOtherMethod();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void someOtherMethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("in some other method");
	}
}
