package introductiontoopps;

public class FanRunner {
	public static void main(String[] args) {
		Fan fan=new Fan("mfg-1", 200, "Black");
	    fan.switchOn();
	    System.out.println(fan);
		fan.setSpeed((byte) 1);
		fan.switchOff();
		System.out.println(fan);
		
	}
}
