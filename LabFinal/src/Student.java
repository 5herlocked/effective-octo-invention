// Shardul Vaidya
// November 29 2018

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private String id;
    private int gpa;

    //constructor
    public Student(String firstName, String lastName, String id, int gpa) {
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
        this.id = id.trim();
        this.gpa = gpa;
    }

    //Gettes and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("First Name: ").append(firstName).append("\n")
                .append("Last Name: ").append(lastName).append("\n")
                .append("ID: ").append(id).append("\n")
                .append("GPA: ").append(gpa).append("\n");

        return builder.toString();
    }

    @Override
    public int compareTo(Student other) {
        if (this.gpa == other.getGpa()){
            if (this.firstName.equals(other.getFirstName())){
                return this.id.compareTo(other.getId());
            }
            return this.firstName.compareTo(other.getFirstName());
        }
        return (int)(this.gpa - other.getGpa());
    }

}
