package introductiontoopps;

public class Review {
	
	private int id ;
	private int rating;
	private String comments;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Review(int id, int rating, String comments) {
		super();
		this.id = id;
		this.rating = rating;
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Review [id=" + id + ", rating=" + rating + ", comments=" + comments + "]";
	}
	
	
}
