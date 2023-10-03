package introductiontoopps;

import java.util.ArrayList;

public class Book extends Auditable{
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews=new ArrayList<Review>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public ArrayList<Review> getReviews() {
		return reviews;
	}
	public void setReviews(ArrayList<Review> reviews) {
		this.reviews = reviews;
	}
	public Book(int id, String name, String author) {
		super(id, author, localDate);
		this.id = id;
		this.name = name;
		this.author = author;
		
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", reviews=" + reviews + "]";
	}
	public void addReviews(Review review) {
		this.reviews.add(review);
		
	}
	
}
