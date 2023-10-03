package codingpractice;
public class DataTypesExample {
    public static void main(String[] args) {
        // Primitive Data Types
        byte age = 30;  //8 bit
        short distance = 5000; //16 bit
        int population = 800_00_00_00; //32bit
        double doubleValue=Double.valueOf(population);
        long worldPopulation = 7800_00_00_00L; // 64 Bits 
        									   // Note the 'L' suffix for long literals
        float pi = 3.14159f;  //32 bits
        					 // Note the 'f' suffix for float literals
        					 //Use float when you need to conserve memory and the required precision is not very high,
        					 //or when dealing with very large arrays of floating-point numbers where memory usage is 
        					//a concern.
       
        double height = 1.85; // 64 bits
        					  //Use double when you need higher precision and don't want to compromise on accuracy. 
                              //double is the default choice for most floating-point calculations in Java.
        char grade = 'A';
        boolean isActive = true;
        
        float value=(int)123f;
        
        // Reference Data Types
        String name = "John"; // String is a reference data type
        int[] numbers = {1, 2, 3}; // Array is a reference data type

        // Printing values to demonstrate the data types
        System.out.println("Age: " + age);
        System.out.println("Distance: " + distance);
        System.out.println("Population: " + population);
        System.out.println("World Population: " + worldPopulation);
        System.out.println("Pi: " + pi);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is Active: " + isActive);
        System.out.println("Name: " + name);
        System.out.println("value: " +value);
        System.out.println("doubleValue " +doubleValue);
        System.out.print("Numbers: ");
       
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
