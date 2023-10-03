package introductiontoopps;

import java.time.LocalDate;

public class Auditable {
	private int id;
	private String owner;
	protected static LocalDate localDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	public Auditable(int id, String owner, LocalDate localDate) {
		super();
		this.id = id;
		this.owner = owner;
		this.localDate = localDate;
	}
	@Override
	public String toString() {
		return "Auditable [id=" + id + ", owner=" + owner + ", localDate=" + localDate + "]";
	}
	
	
}
