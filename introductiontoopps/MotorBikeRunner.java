package introductiontoopps;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		
		ducati.start();
		ducati.setSpeed(100);
		
		ducati.increaseSpeed(200);
		ducati.decreaseSpedd(10);
//		int ducatiSpeed=ducati.getSpeed();
//		ducatiSpeed =ducatiSpeed+100;
		
		System.out.println(ducati.getSpeed());
	}
}
