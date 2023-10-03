package introductiontoopps;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

//9->
	public String isPrime() {
		for (int i = 2; i <= number - 1; i++) {
			if (number % 2 == 0) {
				return "number is Not Prime";
			}
		}
		return "Number is Prime";
	}

	public int sumUpToN() {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public void printTringle() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
}
