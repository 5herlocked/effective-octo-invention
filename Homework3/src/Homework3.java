import java.util.ArrayList;
import java.util.Collections;

public class Homework3 {
    public static void main (String ... args)
    {
        ArrayList<CalendarDate> dates = new ArrayList<>();

        dates.add(new CalendarDate(2001, 6, 10));
        dates.add(new CalendarDate(1974, 8, 23));
        dates.add(new CalendarDate(1977, 4, 23));
        dates.add(new CalendarDate(2000, 2, 10));
        dates.add(new CalendarDate(1999, 10, 4));
        dates.add(new CalendarDate(1976, 1, 5));

        System.out.print ("Before: ");
        System.out.println(dates);

        Collections.sort(dates);

        System.out.println("After: ");
        System.out.println(dates);
    }
}
