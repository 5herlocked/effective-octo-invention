//author: shardul vaidya
//date: 17/9/18
//Student class for Homework 2

public class Undergraduate {
    private boolean honours;

    public Undergraduate(boolean honours, String major, double gpa, int creditHours) {
        this.honours = honours;
        super(major,gpa,creditHours);
    }

    public boolean isHonours() {
        return honours;
    }

    public void setHonours(boolean honours) {
        this.honours = honours;
    }

    @Override
    public String toString() {
        return "Undergraduate{" +
                "Honours=" + honours +
                super.toString();
                '}';
    }
}