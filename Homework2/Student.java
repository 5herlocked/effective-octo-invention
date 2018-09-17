//author: shardul vaidya
//date: 17/9/18
//Student class for Homework 2

public class Student {
	private String major;
	private double gpa;
	private int creditHours;

	private final String[] years = {"Freshman", "Sophomore", "Junior", "Senior"}; 

	public Student (String major, double gpa, int creditHours){
		this.major = major;
		this.gpa = gpa;
		this.creditHours = creditHours;
	}

	public double getGpa () { return gpa; }

	public String getYears () {
		return (creditHours < 32) ? years[0] : (creditHours < 64) ? years[1] : (creditHours < 96) ? years[2] : years[3];
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	@Override
	public String toString() {
		return "Student{" +
				"Major='" + major + '\'' +
				", GPA=" + gpa +
				", Credit Hours=" + creditHours;
	}
}