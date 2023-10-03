import java.util.List;

public class FunctionalProgramming {
	public static void main(String[] args) {
		List<String> list = List.of("Appple", "Banana", "Mango");
		List<Integer> listOfInt = List.of(12, 23, 34, 45, 45, 65,12,23);
		int sum=0;
		for(int ListOfsum:listOfInt) {
			sum=sum+ListOfsum;
		}
		System.out.println("sum" +sum);
		printFP(list);
		printFPOfint(listOfInt);
		printExtracted(list);
	}

	private static void printExtracted(List<String> list) {
		for (String string : list) {
			if (string.endsWith("le")) {
				System.out.println("ends with le " +string);
			}
		}
	}

	private static void printFP(List<String> list) {
		list
		.stream()
		.filter(p->p.endsWith("o"))
		.forEach(element -> System.out.println("element :"+element));
	}

	private static void printFPOfint(List<Integer> listOfInt) {
		//listOfInt.stream().sorted().forEach(p->System.out.println(p));
		listOfInt.stream().distinct().forEach(p->System.out.println(p));
	}
}
