package collectionprogramming;

import java.util.HashSet;
//Set Implementations:
//
//You can choose from different implementations of the Set interface based on your requirements. 
  // Here are a few examples:
//
//HashSet: Provides constant-time O(1) average complexity for basic operations and does not guarantee 
	  // any specific order.
//
//LinkedHashSet: Maintains the order in which elements were added and has a slightly slower performance 
	  // than HashSet. and it follows insertin order
//
//TreeSet: Orders elements based on their natural order or a specified comparator, offering log(n) time 
	   //for basic operations but is less performant for insertion and removal compared to HashSet and LinkedHashSet.

public class Set {
		public static void main(String[] args) {
			HashSet<String> stringSet=new HashSet<String>();
			stringSet.add("apple");
			stringSet.add("banana");
			stringSet.add("apple"); // Duplicate, will not be added

			System.out.println(	"before remove"		+stringSet);
			stringSet.remove("banana");
			System.out.println(	"after remove"		+stringSet);
			boolean check=stringSet.contains("apple");
			System.out.println(check);
			
			for (String string : stringSet) {
				System.out.println(string);
			}
			int size = stringSet.size();
			System.out.println(size);
			
			stringSet.clear();
			System.out.println("after clearing the collection :"+stringSet);
		}
}
