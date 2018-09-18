//author: shardul vaidya
//date 17/9/18
//Undergraduate class for Homework2 

public class Undergraduate extends Student {
	private boolean honours;

    //contructors
    public Undergraduate () {
        super();
        this.honours = false;
    }

    public Undergraduate (String name) {
        super(name);
        this.honours = false;
    }

    public Undergraduate (String name, String major, boolean honours) {
        super(name, major);
        this.honours = honours;
    }

    public Undergraduate (String name, String major, double gpa, boolean honours) {
        this(name, major, honours);
        super.setGPA(gpa);
    }

    public Undergraduate (String name, String major, double gpa, int creditHours) {
        super(name, major, gpa, creditHours);
        this.honours = false;
    }

    public Undergraduate (String name, String major, double gpa, int creditHours, boolean honours) {
        super (name, major, gpa, creditHours);
        this.honours = honours;
    }

    //methods
    public boolean isHonours () { return honours; }

    public void setHonours (boolean honours) { this.honours = honours; }

    @Override
    public String toString () {
        return super.toString() + "\n" +
               "Honours: " + ((honours) ? "Yes" : "No");
    } 
}