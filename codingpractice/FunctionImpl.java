package codingpractice;
public class FunctionImpl {
	
	public static void main(String[] args) {
		
		MyFunctionalInterface myfuntion=()->{
			System.out.println("Switch On...!");
		};
		myfuntion.switchOn();
	}
}