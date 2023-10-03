package introductiontoopps;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("jump above");
	}

	@Override
	public void down() {
		System.out.println("Bend down");
		
	}

	@Override
	public void left() {
		System.out.println("turn to the left");
		
	}

	@Override
	public void right() {
		System.out.println("turn to the right");
	}
	
}
