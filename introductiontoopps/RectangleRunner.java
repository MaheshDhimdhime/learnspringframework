package introductiontoopps;

public class RectangleRunner {
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(0, 0);
		rectangle.setLength(122);
		rectangle.setWidth(100);
		System.out.println("area :"+rectangle.area()+ " perimeter :" +rectangle.getParameter() );
		
	}
}
