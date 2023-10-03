package javatips;

import java.util.Arrays;

enum Season{
	Summer,Winter,Fall,Spring,Winter2,Snow
}
public class EnumRunner {
	public static void main(String[] args) {
		Season season=Season.valueOf("Winter2");
		System.out.println(season.ordinal());
		System.out.println(Arrays.toString(Season.values()));
	}
}
