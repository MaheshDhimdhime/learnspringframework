package codingpractice;

interface Sayable {
	void say(String msg);
}

public class FunctionalInterface implements Sayable {

	@Override
	public void say(String msg) {
		System.out.println("i am saying something...!");

	}

	public static void main(String[] args) {
		FunctionalInterface says=new FunctionalInterface();
		says.say("hello there");
	}

}
