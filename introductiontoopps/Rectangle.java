package introductiontoopps;

public class Rectangle {
	
	private int length;
	private int width;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Rectangle(int length, int width) {
		this.length=length;
		this.width=width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	//opertion
	
	public int getParameter() {
		return 2*(length+width);
	}
	
	public int area() {
		return length*width;
	}
}
