import java.text.NumberFormat;

public class Employee {
    private final int hours = 40;
    private final double salary = 40000.0;
    private final int vacationDays = 10;
    private final String vacationForm = "yellow";

    public Employee() { }

    public int getHours() {
        return hours;
    }

    public double getSalary() {
        return salary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public String getVacationForm() {
        return vacationForm;
    }

    @Override
    public String toString() {
        return "Employee:" +
                "Hours: " + hours + "\n" +
                "Salary: " + NumberFormat.getCurrencyInstance().format(salary) + "\n" +
                "Vacation Days: " + vacationDays + "\n" +
                "Vacation Form: " + vacationForm ;
    }
}
