//author: shardul vaidya
//date: 17/9/18
//Student class for Homework 2

public class Graduate extends Student {
	private String degree; //"masters or phd"
	private String concentration; //"specialisation"
	private int years; //years spent as a grad student

	public Graduate (String major, double gpa, int creditHours) { super(major, gpa, creditHours); }

	public Graduate(String degree, String concentration, int years, String major, double gpa, int creditHours) {
		this(major, gpa, creditHours);
		this.degree = degree;
		this.concentration = concentration;
		this.years = years;
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
				"Gegree='" + degree + '\'' +
				", Concentration='" + concentration + '\'' +
				", Years=" + years +
				'}';
	}
}