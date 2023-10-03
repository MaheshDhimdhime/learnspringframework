package introductiontoopps;

interface Flayable{
	void fly();
}
class Bird implements Flayable{

	@Override
	public void fly() {
		System.out.println("Bird are Flaying with wings..!");
	}
	
}
class Aeroplane implements Flayable{

	@Override
	public void fly() {
		System.out.println("With Fuel");
	}
	
}
public class FlayableRunner {
	public static void main(String[] args) {
		Flayable[] flayableObject= {new Bird(),new Aeroplane()};
		for (Flayable flayable : flayableObject) {
			flayable.fly();
		}
	}
}
