package introductiontoopps;

public abstract class Animal {
	abstract void bark();

	class Dog extends Animal {
		public void bark() {
			System.out.println("Bow Bow");
		}
	}

	class Cat extends Animal {
		public void bark() {
			System.out.println("Meow Meow");
		}
	}

}