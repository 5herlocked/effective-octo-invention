//author: shardul vaidya
//date: 17/9/18
//Graduate class for Homework 2

public class Graduate extends Student {
	private String degree; //"masters or phd"
	private String concentration; //"specialisation"
	private int years; //years spent as a grad student

	public Graduate(String degree, String concentration, String major, double gpa) {
		this.degree = degree;
		this.concentration = concentration;
		this.years = years;
		super.setGpa(gpa);
		super.setMajor(major);
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getConcentration() {
		return concentration;
	}

	public void setConcentration(String concentration) {
		this.concentration = concentration;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	@Override
	public String toString() {
		return "Graduate{" +
				"Degree='" + degree + '\'' +
				", Concentration='" + concentration + '\'' +
				", Years=" + years +
				'}';
	}
}