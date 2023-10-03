package codingpractice;

import java.time.LocalDate;

class Male {
	
	private String gender;
	private int Wimb;
	private String sucessfull;
	private String rich;
	private LocalDate birth;
	
	public LocalDate getBirth() {
		return birth;
	}
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getWimb() {
		return Wimb;
	}
	public void setWimb(int wimb) {
		Wimb = wimb;
	}
	public String getSucessfull() {
		return sucessfull;
	}
	public void setSucessfull(String sucessfull) {
		this.sucessfull = sucessfull;
	}
	public String getRich() {
		return rich;
	}
	public void setRich(String rich) {
		this.rich = rich;
	}
	@Override
	public String toString() {
		return "Male [gender=" + gender + ", Wimb=" + Wimb + ", sucessfull=" + sucessfull + ", rich=" + rich
				+ ", birth=" + birth + "]";
	}
	
	public Male(String gender, int wimb, String sucessfull, String rich, LocalDate birth) {
		super();
		this.gender = gender;
		Wimb = wimb;
		this.sucessfull = sucessfull;
		this.rich = rich;
		this.birth = birth;
	}
	
}
