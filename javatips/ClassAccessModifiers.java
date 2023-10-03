package javatips;

//public,private-same packege only,(default-only same package),protected
public class ClassAccessModifiers {
	public void publicMethod() {};
	protected void protectedMethod() {};
	private void privateMethod() {};
	void defaultMethod() {};
	
	public static void main(String[] args) {
		
		ClassAccessModifiers access=new ClassAccessModifiers();
		access.publicMethod();
		access.protectedMethod();
		access.privateMethod();
		access.defaultMethod();
		
	}
}
