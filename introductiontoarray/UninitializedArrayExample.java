package introductiontoarray;

import java.util.ArrayList;

public class UninitializedArrayExample {
    public static void main(String[] args) {
       ArrayList<Integer> myArray=new ArrayList<Integer>(); // Declaring an array of 5 integers without initialization

        for (int i = 0; i < 5; i++) {
            System.out.println("Element " + i + ": ");
        }
    }
}
