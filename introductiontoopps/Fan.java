package introductiontoopps;

public class Fan {
	//state of object
	private String make;
	private double radius;
	private String color;
	
	private boolean isOn;
	private byte speed;
	
	//creation
	public Fan(String make,double radius,String color) {
		this.make=make;
		this.radius=radius;
		this.color=color;
	}
	
	//isOn
	public void isOn(boolean isOn) {
		this.isOn=isOn;
	}
	
	public void switchOff() {
		this.isOn=false;
		setSpeed((byte)0);
	}
	
	public void switchOn() {
		this.isOn=true;
		setSpeed((byte) 1);
	}
	@Override
	public String toString() {
		return "Fan [make=" + make + ", radius=" + radius + ", color=" + color + ", isOn=" + isOn + ", speed=" + speed
				+ "]";
	}

	public void setSpeed(byte speed) {
		this.speed=speed;
	}
	
}
