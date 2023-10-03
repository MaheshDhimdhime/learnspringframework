package introductiontoopps;

public class MyNumberRunner {
	public static void main(String[] args) {
//		System.out.println("Enter number to check");
//		Scanner sc=new Scanner(System.in);
//		int i=sc.nextInt();
		MyNumber number = new MyNumber(5);
		String isPrime = number.isPrime();
		System.out.println("prime Number ? " + isPrime);

		int sumOfNumber = number.sumUpToN();
		System.out.println("sum upto N " + sumOfNumber);
		number.printTringle();
		
		Integer integer=Integer.valueOf(5);
		System.out.println("this is integer" +integer);
	}
	
}
