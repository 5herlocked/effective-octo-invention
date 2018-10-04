// Author: Shardul Vaidya
public class CalendarDate implements Comparable<CalendarDate> {
    private int year;
    private int month;
    private int day;

    // Constructor
    public CalendarDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getters and Setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public int compareTo(CalendarDate otherDate) {
        if (otherDate.year != this.year)
            return  otherDate.year - this.year;
        else if (otherDate.month != this.month)
            return otherDate.month - this.month;
        else if (otherDate.day != this.day)
            return otherDate.day - this.day;

        return 0;
    }

    @Override
    public String toString() {
        return String.format("Date: %d/%d/%d", month, day, year);
    }
}
