package introductiontoarray;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Student {

	private String name;
	ArrayList<Integer> marks = new ArrayList<Integer>();

	public ArrayList<Integer> getMarks() {
		return marks;
	}

	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getStudentMarks() {
		return marks.size();
	}

	public int sumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximum() {
		int maximum = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > maximum) {
				maximum = mark;
			}
		}
		return maximum;
	}

	public BigDecimal getAverageOfMarks() {
		int sum = sumOfMarks();
		int numberOfMarks = getStudentMarks();
		return new BigDecimal(sum / numberOfMarks);
	}

	public void addNewMarks(int mark) {
		marks.add(mark);
	}

}
