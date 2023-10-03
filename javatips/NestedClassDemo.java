package javatips;

class DefaultClass{
	
}
public class NestedClassDemo {
	class InnerClass{
		
	}
	 static class StaticInnerClass{
		
	}
	public static void main(String[] args) {
		StaticInnerClass staticInnerClass=new StaticInnerClass();
		NestedClassDemo nestedClassDemo=new NestedClassDemo();
		InnerClass innerClass=nestedClassDemo.new InnerClass();
		
	}
}
