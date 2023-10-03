package codingpractice;

class Computer {
	public void playMusic() {
		System.out.println("Music Playing...!");
	}

	public int addNum(int n1,int n2) {
		return n1+n2;
		
	}
	public double addNum(double n1,double n2) {
		return n1+n2;
		
	}
}

public class Object {
	public static void main(String[] args) {
		Computer obj=new Computer();
		int r1=obj.addNum(1, 2);
		double r2=obj.addNum(1.2, 2.2);
		System.out.println(" :" +r1);

		System.out.println(" :" +r2);}
}
