//author: shardul vaidya
//date 17/9/18
//Graduate class for Homework2 

public class Graduate extends Student { 
	private String degree;
	private String concentration;
	private int year;

	//constructors
	public Graduate () {
		super();
		degree = "N/A";
		concentration = "N/A";
		year = 0;
	}

	public Graduate (String name, String major, String degree, String concentration) {
		super(name, major);
		this.degree = degree;
		this.concentration = concentration;
	}

	public Graduate (String name, String major, String degree, String concentration, int year, double gpa) {
		this(name, major, degree, concentration);
		super.setGPA(gpa);
		this.year = year;
	}

	//methods
	public String getDegree () { return degree; }

	public void setDegree (String degree) { this.degree = degree; }

	public String getConcentration () { return concentration; }

	public void setConcentration (String concentration) { this.concentration = concentration; }

	public int getYears () { return year; }

	public void setYear (int year) { this.year = year; }

	@Override
	public String toString() {
		return super.toString() + "\n" +
			   "Degree: " + degree + "\n" + 
			   "Concentration: " + concentration + "\n" +
			   "Year: " + year;
	}
}