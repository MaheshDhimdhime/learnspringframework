package codingpractice;

import java.util.ArrayList;
import java.util.List;

@java.lang.FunctionalInterface
interface Namable {
	String naming();  //single abstract method
}

public class MethodReferenceExample {
	// Reference to a static method:
	public static String getActorName() {
		return "Actor Name";
	}
	//non-static method
	public String fetchingName() {
		return "Name after fetch..!";
	}
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("Mahesh");

		// Using lambda expression to print each name
		names.forEach(name -> {
			System.out.println(name);
			
			//for static ref
			Namable named = MethodReferenceExample::getActorName;
			String ActorName=named.naming();
			System.out.println("static method behav :" +ActorName);
		
			// Reference to a non-static method
            MethodReferenceExample methodRef = new MethodReferenceExample();
            Namable fetchedName = methodRef::fetchingName;
            String named1=fetchedName.naming();
            System.out.println("instance method behav :" +named1);
		});

	}
}
