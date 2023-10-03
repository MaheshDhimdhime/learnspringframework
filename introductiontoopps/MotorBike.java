package introductiontoopps;

public class MotorBike {
	
	int speed;
	
	public void setSpeed(int speed) {
		if(speed>0)
		this.speed=speed;
		else {
			System.out.println("speed is invalid..!" +speed);
		}
	}
	public int getSpeed() {
		return speed;
	}
	
	void start() {
		System.out.println("Bike Start");
	}
	
	public void increaseSpeed(int howMuch) {
		this.speed=speed+howMuch;
	}
	public void decreaseSpedd(int howMuch) {
		this.speed=speed-howMuch;
	}
}
