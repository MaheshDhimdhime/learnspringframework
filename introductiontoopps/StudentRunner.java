package introductiontoopps;

public class StudentRunner {
	public static void main(String[] args) {
		Student student=new Student();
		student.setEmail("abc@gmail.com");
		student.setPhoneNumber(7276542004L);
		System.out.println(student);
		
		Employee employee=new Employee();
		employee.setName("Mahesh");
		employee.setEmail("abc@gmail.com");
		employee.setPhoneNumber(12345678L);
		employee.setEmpGrade('A');
		employee.setTitle("Engineer");
		
		System.out.println(employee);
	}
}
