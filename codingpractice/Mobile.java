package codingpractice;

class Mobile {
	static String name = "smartPhone";
	int price;
	String brand;

	public Mobile() {
		brand = "";
		price = 200;
		System.out.println("in constructor block");
	}

	static {
		name = "";
		System.out.println("in static");
	}

	public void show() {
		System.out.println("name :" + name + "brand :" + brand + "Price :" + price);
	}

	public static void main(String[] args) {
		Mobile obj = new Mobile();
		// obj.name="SmartPhone";
		obj.brand = "Apple";
		obj.price = 2500;

		Mobile obj1 = new Mobile();
		// obj1.name="SmartPhone";
		obj1.brand = "Samsung";
		obj1.price = 2700;

		obj.show();
		obj1.show();
	}
}
