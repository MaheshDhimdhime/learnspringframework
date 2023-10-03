package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJava {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(2, 34, 43, 54, 44, 234,3,9,7,11);
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		for (Integer i : list1) {
			if (i % 2 == 0) {
				list2.add(i);
			}else if(i%2!=0) {
				list3.add(i);
			}
		}
	//	Stream<Integer> fg=list1.stream();
		//System.out.println(list2);
		//System.out.println(list3);
		//with stream
		List<Integer> newList=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> newList1=list1.stream().filter(i->i%2!=0).collect(Collectors.toList());
		
		List<Integer> newList3 =list1.stream().filter(i->i%3==0).collect(Collectors.toList());
		
		List<Integer> numbers=List.of(22, 33, 4,22,12,23,43,54,56,11);
		numbers
		.stream()
		.map(n->n*n)
		.forEach(e->{
			System.out.println(e);
		});
		numbers.stream().sorted().forEach(System.out::println);
		
		System.out.println("Even Numbers :" +newList);
		System.out.println("Odd Numbers :" +newList1);
		System.out.println("3s Numbers :" +newList3);
	}
	
}
