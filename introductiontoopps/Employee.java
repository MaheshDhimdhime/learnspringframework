package introductiontoopps;

public class Employee extends Person{
	private String title;
	private String employer;
	private char empGrade;
	private int salary;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public char getEmpGrade() {
		return empGrade;
	}
	public void setEmpGrade(char empGrade) {
		this.empGrade = empGrade;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
