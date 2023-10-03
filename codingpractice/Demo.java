package codingpractice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Human{
	private int age;
	private int hight;
	private String name;
	private List<Male> male;
	
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age=a;
	}
	public String getName() {
		return name;
	}
	public void setName(String n)
	{
		name=n;
	}
	public List<Male> getMale() {
		return male;
	}
	
	public void setMale(List<Male> listOfMale) {
		this.male = (List<Male>) listOfMale;
	}
	
}
public class Demo {
	public static void main(String[] args) {
		Human obj=new Human();
		obj.setAge(10);
		obj.setName("Mahesh");
		
		List<Male> ListOfMale=new ArrayList<Male>();
		Male male = new Male(null, 0, null, null, null);
		male.setGender("male");
		male.setRich("Yes");
		male.setSucessfull("Yes");
		male.setWimb(2);
		male.setBirth(LocalDate.of(2000, 12, 12));
		ListOfMale.add(male);
		obj.setMale(ListOfMale);
		
		System.out.println("age :"+obj.getAge() +" : "+"name :"+obj.getName()+" -> Male Details"+obj.getMale());
	}
}
