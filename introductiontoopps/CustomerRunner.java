package introductiontoopps;

public class CustomerRunner {
	public static void main(String[] args) {
		Address homeAddress=new Address("line", "Pune", 412308);
		Customer customer =new Customer("Mahesh", homeAddress);
		Address workAddress=new Address("line-2", "Dubai", 112308);
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
	}
}
