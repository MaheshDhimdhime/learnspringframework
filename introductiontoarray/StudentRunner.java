package introductiontoarray;

import java.math.BigDecimal;
import java.util.ArrayList;

public class StudentRunner {
	public static void main(String[] args) {
		
		
		Student student=new Student("Mahesh",26,34,45,56);
		
		int noOfmarks=student.getStudentMarks();
		int sumOfMarks=student.sumOfMarks();
		int maxMarks=student.getMaximum();
	
		System.out.println("without added marks :" +student);
		student.addNewMarks(10);
		System.out.println("with added marks :" +student);
		
		BigDecimal average=student.getAverageOfMarks();
		
		System.out.println("average of marks " +average);
		System.out.println("maximum of marks "+ maxMarks);
		System.out.println("sumOfMarks " +sumOfMarks);
		System.out.println(student);
		System.out.println("no of Marks " + noOfmarks);
	}
}
