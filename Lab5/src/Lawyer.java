import java.text.NumberFormat;

public class Lawyer extends Employee {
    private final int vacationDays = super.getVacationDays()+5;
    private final String vacationForm = "pink";

    @Override
    public int getVacationDays () {
        return vacationDays;
    }

    @Override
    public String getVacationForm () {
        return vacationForm;
    }

    public void sue() {
        System.out.println("I'll see you in court mate!");
    }

    @Override
    public String toString() {
        return "Lawyer:" + "\n" +
                "Salary: " + NumberFormat.getCurrencyInstance().format(super.getSalary()) + "\n" +
                "Hours: " + super.getHours() + "\n" +
                "Vacation Days: " + vacationDays + "\n" +
                "Vacation Form: " + vacationForm ;
    }
}
