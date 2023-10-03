package collectionprogramming;

import java.util.HashMap;

public class Exercise {
	public static void main(String[] args) {
		String str="Akshyausnaaaaaaaalya"
				 +"Mahesh Dhimdhime";
		
		HashMap<String,Integer> occurance=new HashMap<String, Integer>();
		
		String[] words=str.split("");
		
		for (String word : words) {
			Integer integer=occurance.get(word);
			if (integer==null) {
				occurance.put(word, 1);
			}else {
				occurance.put(word, integer+1);
			}
		}
		System.out.println(occurance);
	}
}
//GWT


