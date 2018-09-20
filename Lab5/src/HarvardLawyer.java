import java.text.NumberFormat;

public class HarvardLawyer extends Lawyer {
    private final double salary = super.getSalary() + super.getSalary()*20/100;
    private final int vacationDays = super.getVacationDays() + 3;
    private final String vacationForm = super.getVacationForm();

    public HarvardLawyer() { }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public int getVacationDays() {
        return vacationDays;
    }

    @Override
    public String getVacationForm() {
        return vacationForm + vacationForm + vacationForm;
    }

    @Override
    public String toString() {
        return "Harvard Lawyer: " + "\n" +
                "Salary:" + NumberFormat.getCurrencyInstance().format(salary) + "\n"+
                "Vacation Days: " + vacationDays + "\n" +
                "Vacation Form: " + getVacationForm();
    }
}
