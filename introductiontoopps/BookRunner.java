package introductiontoopps;

import java.time.LocalDate;

public class BookRunner  {
	public static void main(String[] args) {
		
		Book book=new Book(123, "GooD Life", "Mahesh");
		book.addReviews(new Review(123, 4, "nice"));
		book.addReviews(new Review(124, 5, "awsm"));
		book.setLocalDate(LocalDate.now());
		book.setOwner("SYSTEM");
		System.out.println(book+ " " +book.getLocalDate());
	}
}
