package collectionprogramming;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		Anagram anagram=new Anagram();
		Boolean isAnagam=anagram.isAnagramSort("ABND", "BNCV");
		System.out.println("isAnagam :"+isAnagam);
	}
	public boolean isAnagramSort(String string1, String string2) {
	    if (string1.length() != string2.length()) {
	        return false;
	    }
	    char[] a1 = string1.toCharArray();
	    char[] a2 = string2.toCharArray();
	    Arrays.sort(a1);
	    Arrays.sort(a2);
	    return Arrays.equals(a1, a2);
	}
	
}
