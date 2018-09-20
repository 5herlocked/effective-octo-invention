import java.text.NumberFormat;

public class SoftwareEngineer extends Employee{
    private int hours = super.getHours() + 10;
    private double salary = super.getSalary() + 15000;
    private int vacationDays = super.getVacationDays()/2;

    public SoftwareEngineer() { }

    @Override
    public int getHours() {
        return hours;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public int getVacationDays() {
        return vacationDays;
    }

    public void writeCode () {
        System.out.println("Coding!");
    }

    @Override
    public String toString() {
        return "Software Engineer:" + "\n" +
                "Hours: " + hours + "\n" +
                "Salary: " + NumberFormat.getCurrencyInstance().format(salary) + "\n" +
                "Vacation Days: " + vacationDays + "\n" +
                "Vacation Form: " + super.getVacationForm();
    }
}
