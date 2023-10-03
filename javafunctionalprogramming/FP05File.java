package javafunctionalprogramming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FP05File {
	public static void main(String[] args) throws IOException {
		Files.lines(Paths.get("C:\\Users\\mahes\\Desktop\\File.text"))
		.map(t->t.split(""))
		.flatMap(Arrays::stream)
		.distinct()
		.sorted()
		.forEach(System.out::println);
	}
}
