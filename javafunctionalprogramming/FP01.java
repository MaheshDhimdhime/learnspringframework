package javafunctionalprogramming;

import java.util.List;

public class FP01 {
    public static void main(String[] args) {
        List<Integer> numbers=(List.of(1, 23, 34, 32, 45, 43, 34, 22, 11));
        printAllNumberInList(numbers);
        printEvenNumberInList(numbers);
    }

    private static void printAllNumberInList(List<Integer> numbers) {
    	for(int nums:numbers)
        System.out.print(nums  +" ");
    }
    private static void printEvenNumberInList(List<Integer> numbers) {
    	for(int nums:numbers)
    		if(nums%2==0)
        System.out.println(  nums  +" ");
    }
}
