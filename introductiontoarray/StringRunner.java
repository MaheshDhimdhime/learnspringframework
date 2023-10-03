package introductiontoarray;

import java.util.ArrayList;

public class StringRunner {
	public static void main(String[] args) {
		String[] daysOfWeek= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		String daysWithLongString="";
		for (String day : daysOfWeek) {
			if (day.length() > daysWithLongString.length()) {
				daysWithLongString=day;
			}
		}System.out.println("daysWithLongString :"+daysWithLongString);
		
		for(int i=daysOfWeek.length-1;i>=0;i--) {
			System.out.println(daysOfWeek[i]);
		}
	
	ArrayList<Integer> arrys=new ArrayList<Integer>();
	
	System.out.println(arrys);
	}
}
