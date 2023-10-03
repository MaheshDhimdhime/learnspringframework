package collectionprogramming;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap with student names as keys and scores as values
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 92);
        System.out.println("keySet :" +studentScores.keySet());
        System.out.println("Adding key-value pairs :" +studentScores);
       
        // Retrieving values by key
        int aliceScore = studentScores.get("Alice"); // 95

        // Checking for key existence
        boolean hasBob = studentScores.containsKey("Bob"); // true

        // Removing a key-value pair
        studentScores.remove("Charlie");

        // Iterating over the map
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String student = entry.getKey();
            int score = entry.getValue();
            System.out.println("Iterating over the map :"+student + ": " + score);
        }
       for (Entry<String,Integer> string : studentScores.entrySet()) {
    	   
    	  String student= string.getKey();
    	  int score=string.getValue();
    	  System.out.println("student :"+student +"score :"+score);
	}
        // Size of the map
        int size = studentScores.size(); // 2

        // Clearing the map
        studentScores.clear();
    }
}
