//author: shardul vaidya
//date 17/9/18
//Student class for Homework2 

public class Student {
	private String name;
	private String major;
	private double gpa;
	private int creditHours;

	private final String[] years = {"Freshman", "Sophomore", "Junior", "Senior"}; 

	//constructors
	public Student () {
		name = "John Doe";
		major = "N/A";
		gpa = 0.0;
		creditHours = 0;
	}

	public Student (String name) {
		this();
		this.name = name;
	}

	public Student (String name, String major) {
		this(name);
		this.major = major;
	}

	public Student (String name, String major, double gpa) {
		this(name, major);
		this.gpa = gpa;
	}

	public Student (String name, String major, double gpa, int creditHours) {
		this(name, major, gpa);
		this.creditHours = creditHours;
	}

	//methods
	public double getGPA () { return gpa; }

	public void setGPA (double gpa) { this.gpa = gpa; }

	public String getName () { return name; }

	public String getMajor () { return major; }

	public void setMajor (String major) { this.major = major; }

	public void setCreditHours (int creditHours) { this.creditHours = creditHours; }

	public String getYear () {
		return (creditHours < 32) ? years[0] : (creditHours < 64) ? years[1] : (creditHours < 96) ? years[2] : years[3];
	}

	@Override
	public String toString() {
		return "Name: " + name + "\n" +
			   "Major: " + major + "\n" +
			   "GPA: " + gpa + "\n" +
			   "Credit Hours: " + creditHours + "\n" +
               "Year: " + this.getYear();
	}
}